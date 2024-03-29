
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIhandler {
    String personalKey = "npwKekHzsZuwPJiANYfXismH4nz64g5kObc6K4i0";

    public String get(String url) throws IOException, InterruptedException {
        System.out.println(url);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("x-api-key", personalKey)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    public String getQuote(String Stock)  {
        try {
            return get("https://yfapi.net/v6/finance/quote?symbols="+Stock);

        } catch(Exception e){
            System.out.println("ERROR: error getting API quote data");
            e.printStackTrace();
            return null;
        }

    }











}


