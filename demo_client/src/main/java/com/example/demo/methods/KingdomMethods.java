package com.example.demo.methods;

import com.example.demo.classes.Kingdom;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class KingdomMethods {

    public void createKingdoms() {

        String address = "http://localhost:8080/kingdom/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Britan").
                queryParam("sqare", 30000.232).
                queryParam("population", 323000).
                queryParam("amountOfBuildings", 30300);
        System.out.println("Adding a new Kingdom!");
        HttpEntity<Kingdom> response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, Kingdom.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Rom").
                queryParam("sqare", 25000.153).
                queryParam("population", 123000).
                queryParam("amountOfBuildings", 38300);
        System.out.println("Adding a new Kingdom!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, Kingdom.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Germany").
                queryParam("sqare", 45000.153).
                queryParam("population", 223000).
                queryParam("amountOfBuildings", 31500);
        System.out.println("Adding a new Kingdom!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, Kingdom.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "France").
                queryParam("sqare", 40000.153).
                queryParam("population", 210000).
                queryParam("amountOfBuildings", 32300);
        System.out.println("Adding a new Kingdom!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, Kingdom.class);
        System.out.println(response.getBody());
    }

    public void getKingdomByName(String name) {

        String address = "http://localhost:8080/kingdom/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

    public void getAllKingdoms() {

        String address = "http://localhost:8080/kingdom/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

    public void deleteKingdomByName(String name) {

        String address = "http://localhost:8080/kingdom/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.DELETE, null, String.class);
        System.out.println(response.getBody());
    }

    public void updateKingdomByName(String name, double sqare, int population, int amountOfBuildings){

        String address = "http://localhost:8080/kingdom/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name).
                queryParam("sqare", sqare).
                queryParam("population", population).
                queryParam("amountOfBuildings", amountOfBuildings);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.PUT, null, String.class);
        System.out.println(response.getBody());
    }

}
