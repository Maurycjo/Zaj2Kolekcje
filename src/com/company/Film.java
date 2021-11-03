package com.company;

public class Film
{
   private String title;    //tytul filmu
   private String genre;    //gatunek filmu
   private int rating;             //ocena filmu
   private int date;               //data produkcji


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

    public void setDate(int date)
    {
        this.date = date;
    }
}
