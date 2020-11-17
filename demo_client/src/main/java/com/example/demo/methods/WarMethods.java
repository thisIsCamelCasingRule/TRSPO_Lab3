package com.example.demo.methods;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class WarMethods {

    public void war(String kingdom1, String kingdom2){
        String address = "http://localhost:8080/war/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("kingdom1", kingdom1).
                queryParam("kingdom2", kingdom2);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }

}
