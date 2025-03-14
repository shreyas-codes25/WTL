import java.util.Scanner;

public class RSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();

        String[] choices = input.split(" ");
        char first = choices[0].charAt(0);
        char second = choices[1].charAt(0);

        if (first == second) {
            System.out.println("D");
        } else if ((first == 'P' && second == 'R') ||
                (first == 'R' && second == 'S') ||
                (first == 'S' && second == 'P')) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
