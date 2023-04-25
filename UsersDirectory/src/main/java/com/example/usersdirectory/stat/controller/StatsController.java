package com.example.usersdirectory.stat.controller;

import com.example.usersdirectory.dog.controller.DogDTO;
import com.example.usersdirectory.user.controller.UserWithDogDTO;
import com.example.usersdirectory.dog.mapper.DogMapper;
import com.example.usersdirectory.user.mapper.UserMapper;
import com.example.usersdirectory.stat.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    //servicebe mapet megirni, hogy adatbazisbol jonnon a stream apival (findall, stream, collect to map)
    // getmappinget megirni

    private final StatsService statsService;
    private final UserMapper userMapper;
    private final DogMapper dogMapper;

    @Autowired
    public StatsController(StatsService statsService, UserMapper userMapper, DogMapper dogMapper) {
        this.statsService = statsService;
        this.userMapper = userMapper;
        this.dogMapper = dogMapper;
    }

    @GetMapping("/dogs")
    public UserWithDogDTO howManyDogsPerUser(){
        UserWithDogDTO result = new UserWithDogDTO(statsService.getNumberOfDogByUserName());
        return result;
    }

    @GetMapping("dogs/{userId}")
    public DogDTO oldestDogByUser(@PathVariable("userId") Integer userId){
        return dogMapper.convertModelToDTO(statsService.getOldestDogByUser(userId));
    }
}
