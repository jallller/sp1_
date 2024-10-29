package app.dto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TMDbClient {
    private static final String API_KEY = System.getenv("API_KEY");
    private static final String TMDB_URL = "https://api.themoviedb.org/3/discover/movie";

    public void fetchMovies() throws IOException {
        URL url = new URL(TMDB_URL + "?api_key=" + API_KEY);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
