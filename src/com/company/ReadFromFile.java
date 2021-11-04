package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile
{

    public String[] InfoFilm;
    public int numberOfFilms=0;


    public void inputFile()
    {
        File plik = new File("filmy.txt"); // obiekt przechowywujące dane z pliku tekstowego
        try {


            Scanner in = new Scanner(plik); //odczyt danych

            numberOfFilms = in.nextInt();
            System.out.print("liczba filmow: ");
            System.out.print(numberOfFilms);

            InfoFilm = new String[numberOfFilms * 4];
            int[] infoRating = new int[numberOfFilms];

            for (int i = 0; i < numberOfFilms * 4; i += 4) {
                InfoFilm[i] = in.nextLine();
                InfoFilm[i + 1] = in.nextLine();
                InfoFilm[i + 2] = in.nextLine();
                InfoFilm[i + 3] = in.nextLine();
            }
        }catch (FileNotFoundException e)
        {
            System.err.println("Nie odnalieziono pliku");
        }
    }



}
