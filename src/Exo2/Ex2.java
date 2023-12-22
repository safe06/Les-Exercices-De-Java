package Exo2 ;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 2 :Écrire un programme en Java qui permet de calculer la somme S=1+2+3+...+ 10. Utilisant la boucle for.
        int somme =0 ;

        for (int i = 1 ; i <=10 ; i++) {
            somme += i;
        }

        System.out.println("la somme est :" + somme);

       



        scanner.close();
       





    }
}
