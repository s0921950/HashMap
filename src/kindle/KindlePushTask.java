package kindle;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KindlePushTask implements Runnable {

    @Override
    public void run() {
        int j = 0;
        for (int i = 0; i < 5; i++) {
            try {
                int responseCode = 1;

                if (i == 2 && j != 2) {
                    responseCode = 401;
                }
                // Check if we received a failure response, and if so, get the reason for the failure.
                if (responseCode != 200) {
                    if (responseCode == 401) {
                        // If a 401 response code was received, the access token has expired. The token should be refreshed
                        // and this request may be retried.
                        System.out.println("j:" + j);
                        i--;
                        j++;
                    }
                    System.out.println("i:" + i);
                    String errorContent = "errorContent";
                    throw new RuntimeException(String.format("ERROR: The enqueue request failed with a "
                            + "%d response code, with the following message: %s", responseCode, errorContent));
                } else {
                    // The request was successful. The response contains the canonical Registration ID for the specific instance of your
                    // app, which may be different that the one used for the request.

                }

            } catch (RuntimeException e) {
                System.out.println("RuntimeException");
            }
        }
    }

    public static String getAuthToken(String clientId, String clientSecret) throws Exception {
        String accessToken = "111";
        return accessToken;
    }

    private static String parseResponse(InputStream in) throws Exception {
        InputStreamReader inputStream = new InputStreamReader(in, "UTF-8");
        BufferedReader buff = new BufferedReader(inputStream);

        StringBuilder sb = new StringBuilder();
        String line = buff.readLine();
        while (line != null) {
            sb.append(line);
            line = buff.readLine();
        }

        return sb.toString();
    }
}
