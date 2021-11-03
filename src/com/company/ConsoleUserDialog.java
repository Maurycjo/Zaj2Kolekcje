package com.company;
import  java.util.Scanner;

public class ConsoleUserDialog
{
    private final Scanner scan = new Scanner(System.in);

    public int displayMenu()
    {
        int menu=0;
        while(menu<1||menu>4)
        {
            System.out.println("(1) HashSet");
            System.out.println("(2) TreeSet");
            System.out.println("(3) ArrayList");
            System.out.println("(4) LinkedList");
            System.out.println("Wybierz strukture: ");
            menu = scan.nextInt();
        }
        return menu;
    }




}
