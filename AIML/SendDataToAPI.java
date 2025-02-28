package AIML;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SendDataToAPI {
    public static void main(String[] args) {
        String apiURL = "https://mangalgrahsevasanstha.org.in/insert_data.php";
        
        for (int i = 1; i <= 15; i++) {
            sendData(apiURL, 0, 0.0f, false);
        }
    }

    private static void sendData(String apiURL, int bpm, float temperature, boolean fallDetected) {
        try {
            URL url = new URL(apiURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setDoOutput(true);

            String postData = "bpm=0&temperature=0.00&fall_detected=0";
            byte[] postDataBytes = postData.getBytes(StandardCharsets.UTF_8);

            try (OutputStream os = conn.getOutputStream()) {
                os.write(postDataBytes);
                os.flush();
            }

            int responseCode = conn.getResponseCode();
            System.out.println("Entry sent. HTTP Response Code: " + responseCode);
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}