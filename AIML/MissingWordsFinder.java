package AIML;
import java.util.*;

public class MissingWordsFinder {
    public static void main(String[] args) {
        String str1 = "We are a students";
        String str2 = "We is a students";
        
        findMissingWords(str1, str2);
    }
    
    public static void findMissingWords(String str1, String str2) {
        String[] lines1 = str1.split("\\n");
        String[] lines2 = str2.split("\\n");
        
        int maxLines = Math.max(lines1.length, lines2.length);
        
        for (int i = 0; i < maxLines; i++) {
            Set<String> words1 = (i < lines1.length) ? new HashSet<>(Arrays.asList(lines1[i].split(" "))) : new HashSet<>();
            Set<String> words2 = (i < lines2.length) ? new HashSet<>(Arrays.asList(lines2[i].split(" "))) : new HashSet<>();
            
            Set<String> missingFromStr2 = new HashSet<>(words1);
            missingFromStr2.removeAll(words2);
            
            Set<String> missingFromStr1 = new HashSet<>(words2);
            missingFromStr1.removeAll(words1);
            
            if (!missingFromStr2.isEmpty()) {
                System.out.println("Line " + (i + 1) + ": Missing from String 2 -> " + missingFromStr2);
            }
            if (!missingFromStr1.isEmpty()) {
                System.out.println("Line " + (i + 1) + ": Missing from String 1 -> " + missingFromStr1);
            }
        }
    }
}