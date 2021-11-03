package com.company;
import java.util.HashSet;
import  java.util.Scanner;

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
        System.out.println("(2) usun film");
        System.out.println("(3) iteracja po elementach");
        System.out.println("(4) Wyswietl filmy");



    }

    public void executeOperations()
    {
        displayOperations();
        switch(menu)
        {
            case 1:
                HashSet<Film> film = new HashSet<>();
                //metoda wczytujaca z pliku tekstowego
                if(menu==1)
                {
                    Film f= new Film();
                    f.addFilm();
                    film.add(f);
                }
                if(menu==2)
                {
                    film.;
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
