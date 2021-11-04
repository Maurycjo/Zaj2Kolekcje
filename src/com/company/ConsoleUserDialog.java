package com.company;
import com.sun.source.tree.Tree;

import java.io.File;
import java.util.HashSet;
import  java.util.Scanner;
import  java.util.*;

public class ConsoleUserDialog
{

    private final Scanner scan = new Scanner(System.in);
    public int menuStruc=0;
    public int menu=0;


    public void displayMenu()
    {
        while(menuStruc<1||menuStruc>4)
        {
            System.out.println("(1) HashSet");
            System.out.println("(2) TreeSet");
            System.out.println("(3) ArrayList");
            System.out.println("(4) LinkedList");
            System.out.println("Wybierz strukture: ");
            menuStruc = scan.nextInt();
        }
    }

    public void displayOperations()
    {
        System.out.println("(1) Dodaj film");
        System.out.println("(2) Wyswietl filmy(iterator)");
        System.out.println("(3) Wyjscie");
        System.out.println("Wybierz operacje: ");
        menu= scan.nextInt();


    }

    public void executeOperations()
    {

        ReadFromFile input = new ReadFromFile();
        input.inputFile();
        displayOperations();

        switch(menuStruc)
        {
            case 1:
                HashSet<Film> film = new HashSet<Film>();
                for(int i=0;i<input.numberOfFilms*4;i+=4)
                {
                    Film f = new Film();
                    f.setTitle(input.InfoFilm[i]);
                    f.setGenre(input.InfoFilm[i + 1]);
                    f.setRating(Integer.parseInt(input.InfoFilm[i + 2]));
                    f.setDate(input.InfoFilm[i + 3]);
                    film.add(f);
                }
                while(menu!=3)
                {

                    if (menu == 1)
                    {
                        Film f = new Film();
                        f.addFilm();
                        film.add(f);
                    }
                    else if (menu == 2)
                    {
                        Iterator<Film> itr = film.iterator();
                        while (itr.hasNext())
                        {
                            Film f = itr.next();
                            f.displayFilm();
                            System.out.println();
                        }
                    }
                    else
                        System.out.println("podaj wlasciwy numer");
                        displayOperations();
                }
                break;
            case 2:
                //TreeSet Comparator sortuje filmy po ratingu
                Set<Film> treeFilm = new TreeSet<>(Comparator.comparing(Film::getRating));
                
                //TreeSet<Film> treeFilm = new TreeSet<Film>();
                for(int i=0;i<input.numberOfFilms*4;i+=4)
                {
                    Film f = new Film();
                    f.setTitle(input.InfoFilm[i]);
                    f.setGenre(input.InfoFilm[i + 1]);
                    f.setRating(Integer.parseInt(input.InfoFilm[i + 2]));
                    f.setDate(input.InfoFilm[i + 3]);
                    treeFilm.add(f);
                }
                while(menu!=3)
                {
                    if (menu == 1)
                    {
                        Film f = new Film();
                        f.addFilm();
                        treeFilm.add(f);
                    }
                    else if (menu == 2)
                    {
                        Iterator<Film> itrT = treeFilm.iterator();
                        while (itrT.hasNext())
                        {
                            Film f = itrT.next();
                            f.displayFilm();
                            System.out.println();
                        }
                    }
                    else
                        System.out.println("podaj wlasciwy numer");
                    displayOperations();
                }
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
