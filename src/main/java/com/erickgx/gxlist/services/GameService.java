package com.erickgx.gxlist.services;


import com.erickgx.gxlist.dto.GameMinDTO;
import com.erickgx.gxlist.entities.Game;
import com.erickgx.gxlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

        //List<Game> result = gameRepository.findAll();
        //		return result.stream().map(GameMinDTO::new).toList();
    }
}
