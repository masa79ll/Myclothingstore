package com.example.myclothingstore;

public class Clothing {
    private String id;
    private String name;
    private String type;
    private String description;
    private String logoUrl;

    public Clothing(String id, String name, String type, String description, String logoUrl){
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.logoUrl = logoUrl;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void getType(){
        return type;
    }
    public void setType(Stimg type){
        this.type=type;
    }
}

