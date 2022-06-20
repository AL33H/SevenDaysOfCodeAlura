package br.com.sevendaysofcodealura.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "imdb", url = "https://imdb-api.com/en/API/Top250Movies/${properties.ApiKey}")
@PropertySource("classpath:/application.properties")
public interface imdbFeingClient {

    static final String userAgent = "user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";

    @GetMapping(headers = userAgent)
    String findAll();

}
