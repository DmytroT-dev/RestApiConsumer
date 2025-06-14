package com.javaee;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RestApiConsumer {
    public static void main( String[] args ) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> jsonToSend = new HashMap<>();
        jsonToSend.put("name", "morpheus");
        jsonToSend.put("job", "matrix");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonToSend, headers);

        String url = "https://jsonplaceholder.typicode.com/posts";

        String response = restTemplate.postForObject(url, request, String.class);

        System.out.println(response);

        //String response = restTemplate.getForObject(url, String.class);






    }
}
