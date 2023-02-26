package com.nova.terra.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tile")
public class Tile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Title;
    private String Contet;

    public Tile() {

    }

    public Tile(String title, String contet) {

        this.Title = title;
        Contet = contet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContet() {
        return Contet;
    }

    public void setContet(String contet) {
        Contet = contet;
    }
}
