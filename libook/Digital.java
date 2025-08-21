package com.grindingjava.learning.libook;

public class Digital extends book {
    private double fileSizeMB;

    public Digital (String title, String author,double fileSizeMB){
        super(title,author);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Title: %s, Author: %s, File Size: %.2f MB%n",getTitle(),getAuthor(),getFileSizeMB());
    }
}

