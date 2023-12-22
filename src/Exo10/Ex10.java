package Exo10 ;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 10 :Écrivez un programme Java qui inverse une chaîne de caractères.
        StringBuilder str = new StringBuilder("Bientot les vacances") ;
        System.out.println(str.toString());

        str.reverse () ;
         System.out.println(str.toString());
       



        scanner.close();
       





    }
}
