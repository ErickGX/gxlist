package com.erickgx.gxlist.dto;

import com.erickgx.gxlist.entities.Game;

public class GameMinDTO {
    // A classe GameMinDTO é uma Data Transfer Object (DTO) que simplifica a
    // transferência de dados entre camadas contendo apenas um subconjunto específico dos atributos da entidade Game

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameMinDTO(){

    }


    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        // O construtor inicializa os atributos da classe GameMinDTO com os valores dos atributos do objeto Game fornecido.
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}

