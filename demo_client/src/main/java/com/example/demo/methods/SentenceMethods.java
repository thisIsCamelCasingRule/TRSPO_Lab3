package com.example.demo.methods;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class SentenceMethods {

    public void execute(String peasant, String kingdom){
        String address = "http://localhost:8080/sentence/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("peasant", peasant).
                queryParam("kingdom", kingdom);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

    public void pardon(String peasant){
        String address = "http://localhost:8080/sentence/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("peasant", peasant);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

}
