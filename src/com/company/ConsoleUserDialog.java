package com.company;
import java.io.File;
import java.util.HashSet;
import  java.util.Scanner;
import  java.util.*;

public class ConsoleUserDialog
{

    private final Scanner scan = new Scanner(System.in);
    public int menu=0;


    public void displayMenu()
    {
        while(menu<1||menu>4)
        {
            System.out.println("(1) HashSet");
            System.out.println("(2) TreeSet");
            System.out.println("(3) ArrayList");
            System.out.println("(4) LinkedList");
            System.out.println("Wybierz strukture: ");
            menu = scan.nextInt();
        }
    }

    public void displayOperations()
    {
        System.out.println("(1) Dodaj film");
        System.out.println("(2) Wyswietl filmy(iterator)");



    }

    public void executeOperations() throws Exception {
        displayOperations();
        ReadFromFile input = new ReadFromFile();
        input.inputFile();

        switch(menu)
        {
            case 1:
                HashSet<Film> film = new HashSet<>();
                for(int i=0;i<input.numberOfFilms;i++)
                {
                    Film f = new Film();
                    f.setTitle(input.InfoFilm[i]);
                    f.setGenre(input.InfoFilm[i + 1]);
                    f.setRating(Integer.parseInt(input.InfoFilm[i + 2]));
                    f.setDate(input.InfoFilm[i + 3]);
                    film.add(f);
                }

                if(menu==1)
                {
                    Film f= new Film();
                    f.addFilm();
                    film.add(f);
                }
                if(menu==2)
                {
                    Iterator itr = film.iterator();
                    while (itr.hasNext())
                        System.out.print(itr.next()+ ", ");
                    System.out.println();
                }

                //hashset
                break;
            case 2:
                //TreeSet
                break;
            case 3:
                //arrayList
                break;
            case 4:
                //linkedList
                break;



        }

    }





}
