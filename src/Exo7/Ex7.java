package Exo7 ;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 7 :Écrivez un programme Java qui accepte trois nombres 
        //et affiche "Tous les nombres sont égaux" si les trois nombres sont égaux, 
        //"Tous les nombres sont différents" si les trois nombres sont différents et 
        //sinon "Ni tous ni égaux ni différents".

        System.out.println("saisir un 1 ére nombre");
        int nbr1 = scanner.nextInt();
        System.out.println(nbr1);

        System.out.println("saisir un 2 éme nombre");
        int nbr2 = scanner.nextInt();
        System.out.println(nbr2);

        System.out.println("saisir un 3 éme nombre");
        int nbr3 = scanner.nextInt();
        System.out.println(nbr3);

        if (nbr1 == nbr2 && nbr2 == nbr3) {
            System.out.println("Tous les nombres sont égaux");
        }

        else if (nbr1 != nbr2 && nbr1 != nbr3 && nbr2 != nbr3) {
            System.out.println("Tous les nombres sont différents");
        }

        else {
            System.out.println("Ni tous ni égaux ni différents");
        }



        scanner.close();
       





    }
}
