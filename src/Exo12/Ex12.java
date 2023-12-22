package Exo12;

import java.util.Random;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 12 : Nombre magique
        //Écrire un programme Java qui permet à l'utilisateur de deviner un nombre choisi aléatoirement par l'ordinateur. 
        //Le programme doit donner des indications à l'utilisateur sur si le nombre à deviner est plus grand 
        //ou plus petit que la proposition de l'utilisateur. 
        //Le jeu doit se poursuivre tant que l'utilisateur n'a pas correctement deviné le nombre.

        Random nombreMagique = new Random() ;
        int nbr = nombreMagique.nextInt(10);
        int deviner ;
        int nbrEssais = 0 ;

        System.out.println("Deviner le nombre magique ");

        while (true) {
            System.out.println("saisir un nombre");
            deviner = scanner.nextInt();
            nbrEssais++ ;
            if (deviner < nbr ) {
                System.out.println("trop petit");
            }
            else if (deviner > nbr) {
                System.out.println("trop grand");
            }
            else {
                System.out.println("bravo");
                System.out.println("le nombre d'essais est :" + nbrEssais);
                break ;
            }
        }



        

        
       



        scanner.close();
       





    }
}

