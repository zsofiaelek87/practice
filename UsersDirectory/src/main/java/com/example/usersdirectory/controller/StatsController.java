package com.example.usersdirectory.controller;

import com.example.usersdirectory.mapper.DogMapper;
import com.example.usersdirectory.mapper.UserMapper;
import com.example.usersdirectory.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("stats")
public class StatsController {
    //TODO: /stats for requests
    // endpoints for methods (get)
    // -> userenkent hany kutyaja van (map: username, kutyak szama)
    // -> add vissza minden userhez a legidosebb kutyajat (DTO (json): userid, username, kutyaname of the legidosebb)
    // 2 db DTO maphez es a legidosebbhez
    // 1 db controller a ket uj get methodshoz
    // stats service kalkulalashoz DO NOT USE REPOSITORIES DIRECTLY - use mappers with dog and user services

    private final StatsService statsService;
    private final UserMapper userMapper;
    private final DogMapper dogMapper;

    @Autowired
    public StatsController(StatsService statsService, UserMapper userMapper, DogMapper dogMapper) {
        this.statsService = statsService;
        this.userMapper = userMapper;
        this.dogMapper = dogMapper;
    }

    public Map<UserDTO, Integer> howManyDogsPerUser(){
        return null;
    }

    public DogDTO oldestDogByUser(UserDTO userDTO){
        return null;
    }
}
