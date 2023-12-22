package Exo1 ;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 1 :
        //Écrire un programme en Java qui demande l'âge d'un enfant et permet d'informer de sa catégorie sachant que les catégories sont les suivantes: 
        //"poussin de 6 a 7 ans"
        //"pupille de 8 a 9 ans "
        //"minime de 10 a 11 ans "
        //" cadet après 12 ans ".
        System.out.println("saisie l'age d'un enfant");
        Integer u = scanner.nextInt();
        System.out.println(u);

        switch (u) {
            case 6, 7: 
                System.out.println("poussin");
                break;
            case 8, 9:
                System.out.println("pupille");
                break;
            case 10, 11:
                System.out.println("minime");
                break;
            default:
                System.out.println("cadet");
                break;
        }


        scanner.close();
        
    }
}
