package com.example.demo.methods;

import com.example.demo.classes.Peasant;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class PeasantMethods {
    public void createPeasant() {

        String address = "http://localhost:8080/peasant";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Joe").
                queryParam("position", "Pirate").
                queryParam("kingdom", "Britan").
                queryParam("status", true);
        System.out.println("Adding a new Peasant!");
        HttpEntity<Peasant> response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, Peasant.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Jula").
                queryParam("position", "Gardener").
                queryParam("kingdom", "Rom").
                queryParam("status", true);
        System.out.println("Adding a new Peasant!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, Peasant.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Frank").
                queryParam("position", "Blacksmith").
                queryParam("kingdom", "Germany").
                queryParam("status", true);
        System.out.println("Adding a new Peasant!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, Peasant.class);
        System.out.println(response.getBody());

        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Tom").
                queryParam("position", "SmthMaster").
                queryParam("kingdom", "France").
                queryParam("status", true);
        System.out.println("Adding a new Peasant!");
        response = restTempl.exchange(builder.toUriString(), HttpMethod.POST, null, Peasant.class);
        System.out.println(response.getBody());
    }

    public void getPeasantByName(String name) {

        String address = "http://localhost:8080/peasant/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

    public void getAllPeasant() {

        String address = "http://localhost:8080/peasant/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

    public void deletePeasantByName(String name) {

        String address = "http://localhost:8080/peasant/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.DELETE, null, String.class);
        System.out.println(response.getBody());
    }

    public void updatePeasantByName(String name, String position, String kingdom, boolean status){
        String address = "http://localhost:8080/peasant/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", name).
                queryParam("kingdom", kingdom).
                queryParam("position", position).
                queryParam("status", status);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.PUT, null, String.class);
        System.out.println(response.getBody());
    }
}
