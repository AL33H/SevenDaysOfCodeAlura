package br.com.sevendaysofcodealura.controller;

import br.com.sevendaysofcodealura.service.ImdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("imdb")
public class imdbController {

    @Autowired
    ImdbService imdbService;

    @GetMapping("/")
    public List<String> findAll(@RequestParam(value = "info", defaultValue = "titles")  String info) {
        List<String> all = imdbService.findAll(info);
        System.out.println(all);
        return all;
    }
}
