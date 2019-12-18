package pl.programator;

import org.springframework.web.client.RestTemplate;
import pl.programator.model.Country;

public class App {
    public static void main(String[] args) {
        String url = "http://localhost:8181/getCountryByName/Polska";
        RestTemplate restTemplate = new RestTemplate();
        Country countryFroServer = restTemplate.getForObject(url, Country.class);

        System.out.println(countryFroServer);
    }
}
