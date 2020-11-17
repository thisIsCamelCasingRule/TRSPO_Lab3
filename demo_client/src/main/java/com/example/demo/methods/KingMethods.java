package com.example.demo.methods;

import com.example.demo.classes.King;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class KingMethods {

    public void createKing() {

        String address = "http://localhost:8080/king/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Georg II").
                queryParam("kingdom", "Britan");
        System.out.println("Adding a new King!");
        HttpEntity<King> response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, King.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Juli Cezar").
                queryParam("kingdom", "Rom");
        System.out.println("Adding a new King!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, King.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Frank Fedenant").
                queryParam("kingdom", "Germany");
        System.out.println("Adding a new King!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, King.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Napoleon").
                queryParam("kingdom", "France");
        System.out.println("Adding a new King!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, King.class);
        System.out.println(response.getBody());
    }

    public void getKingByName(String name) {

        String address = "http://localhost:8080/king/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

    public void getAllKing() {

        String address = "http://localhost:8080/king/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

    public void deleteKingByName(String name) {

        String address = "http://localhost:8080/king/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.DELETE, null, String.class);
        System.out.println(response.getBody());
    }

    public void updateKingByName(String name, String kingdom){
        String address = "http://localhost:8080/king/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name).
                queryParam("kingdom", kingdom);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.PUT, null, String.class);
        System.out.println(response.getBody());
    }
}
