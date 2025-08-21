package com.grindingjava.learning.libook;

public class Physical extends book {
    private int weightGrams;

    public Physical (String title, String author, int weightGrams){
        super(title, author);
        this.weightGrams = weightGrams;
    }

    public int getWeightGrams() {
        return weightGrams;
    }

    @Override
    public void displayDetails(){
        System.out.printf("Title: %s, Author: %s, weight: %d MB%n",getTitle(),getAuthor(),getWeightGrams());
    }
}
