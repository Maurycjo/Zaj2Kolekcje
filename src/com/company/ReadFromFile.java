package com.company;

import java.util.Scanner;

public class ReadFromFile
{
    public String[] InfoFilm;
    public int numberOfFilms=0;

    public void inputFile()
    {
        Scanner in = new Scanner(System.in);
        numberOfFilms=in.nextInt();

        InfoFilm=new String[numberOfFilms*3];
        int[] infoRating=new int[numberOfFilms];

        for(int i=0;i<numberOfFilms*4;i+=4)
        {
            InfoFilm[i] = in.nextLine();
            InfoFilm[i + 1] = in.nextLine();
            InfoFilm[i + 2] = in.nextLine();
            InfoFilm[i + 3] = in.nextLine();
        }

    }



}
