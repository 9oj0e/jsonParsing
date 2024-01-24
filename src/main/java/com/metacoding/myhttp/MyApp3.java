package com.metacoding.myhttp;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyApp3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users/1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );
            String download = "";
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                download = download + line;
            }
            ObjectMapper om = new ObjectMapper();
            Users users = om.readValue(download, Users.class);

            System.out.println(users);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
