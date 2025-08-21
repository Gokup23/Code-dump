package com.grindingjava.learning.libook;

public abstract class book {
    private String title;
    private String author;

    public book(String title,String author){
        this.author = author;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public abstract void displayDetails();
}


