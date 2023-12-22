package Exo3 ;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 3:
        //Écrire  un programme en Java  qui  permet d'échanger le contenu de deux entiers  A et B  
        //saisis par l'utilisateur. et afficher ces entiers  après l’échange.
        
        System.out.println("Saisir un nombre A: ");
        int A = scanner.nextInt();
        System.out.println(A);

        System.out.println("Saisir un nombre B: ");
        int B = scanner.nextInt();
        System.out.println(B);
        
      
       System.out.println("le valeur de A est :" + B + "le valeur de B est : " + A);


        scanner.close();






    }
}

