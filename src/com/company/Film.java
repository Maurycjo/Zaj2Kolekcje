package com.company;

import java.io.*;
import java.util.Scanner;

public class Film
{
   private String title=null;    //tytul filmu
   private String genre=null;    //gatunek filmu
   private int rating=0;             //ocena filmu
   private String date=null;               //data produkcji

    private final Scanner scan = new Scanner(System.in);


    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public String getDate() {
        return date;
    }

    public void addFilm()
    {
        String cin;
        int ratio;
        System.out.println("Podaj tytul");
        cin= scan.next();
        setTitle(cin);


        System.out.println("Podaj gatunek");
        cin=scan.next();
        setGenre(cin);

        System.out.println("Podaj rating");
        ratio=scan.nextInt();
        setRating(ratio);

        System.out.println("Podaj date produkcji");
        cin=scan.next();
        setDate(cin);
    }

    public void displayFilm()
    {
        System.out.println(getTitle());
        System.out.println(getGenre());
        System.out.println(getRating());
        System.out.println(getDate());
    }


}
