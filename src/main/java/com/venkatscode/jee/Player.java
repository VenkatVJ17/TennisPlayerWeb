package com.venkatscode.jee;


import java.sql.Date;

public class Player {
    private int id;
    private String name;
    private String nationality;
    private Date birthDate;
    private int titles;

    public Player(int id, String name, String nationality, Date birthDate, int titles) {
        super();
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.titles = titles;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public int getTitles() {
        return titles;
    }

}