package com.company;

import java.util.Scanner;

public class Film
{
   private String title;    //tytul filmu
   private String genre;    //gatunek filmu
   private int rating;             //ocena filmu
   private String date;               //data produkcji

    private final Scanner scan = new Scanner(System.in);


    public void setTitle(String title) throws Exception
    {
        if(title==null)
            throw new Exception("Musi byc podany tytul filmu");
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


    public void inputFilm()
    {
        String cin;
        int ratio;
        System.out.println("Podaj tytul");
        cin= scan.nextLine();
        try
        {
            setTitle(cin);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Podaj gatunek");
        cin=scan.nextLine();
        setGenre(cin);

        System.out.println("Podaj rating");
        ratio=scan.nextInt();
        setRating(ratio);

        System.out.println("Podaj date produkcji");
        cin=scan.nextLine();
        setDate(cin);


    }


}
