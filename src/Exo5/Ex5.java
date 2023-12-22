package Exo5 ;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 5 :
       // Écrivez un programme Java qui demande son nom à l’utilisateur 
       //et qui affiche «Bonjour» à l'écran et le nom sur une ligne distincte.

       System.out.println("saisir votre nom :");
       String nom = scanner.nextLine();
       System.out.println(nom);

       System.out.println("Bonjour " + nom);
    


        scanner.close();






    }
}
