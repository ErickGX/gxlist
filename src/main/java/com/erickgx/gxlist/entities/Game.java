package com.erickgx.gxlist.entities;

import jakarta.persistence.*;
import java.util.Objects;



@Entity
@Table(name = "tb_game")
public class Game {

    //anotações Spring para ORM
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year ")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    //especificação TEXT para o banco aceitar mais que o varchar(265) padrão, aceita texto grande agora
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {
    }

    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public Game setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Game setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public Game setYear(Integer year) {
        this.year = year;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Game setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Game setPlatforms(String platforms) {
        this.platforms = platforms;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public Game setScore(Double score) {
        this.score = score;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Game setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Game setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public Game setLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Game game = (Game) obj;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
