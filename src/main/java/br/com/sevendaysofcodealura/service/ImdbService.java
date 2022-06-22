package br.com.sevendaysofcodealura.service;

import br.com.sevendaysofcodealura.model.ItemDTO;
import br.com.sevendaysofcodealura.model.ResponseImdbDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImdbService {

    @Autowired
    ImdbFeingClient imdbFeingClient;


    public List<String> findAll(String parametros) {
        ResponseImdbDTO all = imdbFeingClient.findAll();


        switch (parametros) {
            case "titles":
                return all.getItems().stream()
                        .map(ItemDTO::getTitle)
                        .collect(Collectors.toList());
            case "image":
                return all.getItems().stream()
                        .map(ItemDTO::getImage)
                        .collect(Collectors.toList());
            default:
                return all.getItems().stream()
                        .map(ItemDTO::getFullTitle)
                        .collect(Collectors.toList());
        }
    }
}
