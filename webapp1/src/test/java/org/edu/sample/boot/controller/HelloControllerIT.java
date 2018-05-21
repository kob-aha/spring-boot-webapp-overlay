package org.edu.sample.boot.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class HelloControllerIT {
    private RestTemplate restTemplate;
    private URL baseUrl;

    @Before
    public void init() throws MalformedURLException {
        restTemplate = new RestTemplate();
        baseUrl = new URL("http://localhost:" + System.getProperty("server.port", "8080") + "/");
    }

    @Test
    public void testController() {
        ResponseEntity<String> response = restTemplate.getForEntity(baseUrl.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
    }

}
