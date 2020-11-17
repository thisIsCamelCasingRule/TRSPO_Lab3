package com.example.demo.methods;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class RebealMethods {

    public void rebeal(String oldKing, String newKing){
        String address = "http://localhost:8080/rebeal/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("oldKing", oldKing).
                queryParam("newKing", newKing);
        HttpEntity<Boolean> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, Boolean.class);
        System.out.println(response.getBody());
    }
}
