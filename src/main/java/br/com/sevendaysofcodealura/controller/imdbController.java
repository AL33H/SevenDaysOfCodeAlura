package br.com.sevendaysofcodealura.controller;

import br.com.sevendaysofcodealura.service.imdbFeingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("imdb")
public class imdbController {

    @Autowired
    imdbFeingClient imdbFeingClient;

    @GetMapping("/")
    public String findAll(){
        String all = imdbFeingClient.findAll();
        System.out.println(all);
        return all;
    }
}
