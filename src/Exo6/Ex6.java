package Exo6 ;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 6 :
       // Écrivez un programme Java qui demande deux chiffres à un utilisateur, 
       //pour afficher la somme (addition), multiplier, soustraire, diviser et le reste.v

       System.out.println("Saisir le 1 ére nombre : ");
       float x = scanner.nextFloat();
       System.out.println(x);

       System.out.println("Saisir une 2 éme nombre : ");
       float y = scanner.nextFloat();
       System.out.println(y);

       System.out.println("le résultat de l'addition est : " + (x+y));
       System.out.println("le résultat de la multiplication est : " + (x*y));
       System.out.println("le résultat de la soustraction est : " + (x-y));

      if (y != 0){
        System.out.println("le résultat de division est " + (x/y));
      }
     else {
        System.out.println("erreur");
     }



        scanner.close();






    }
}
