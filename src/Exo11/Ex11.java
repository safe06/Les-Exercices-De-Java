package Exo11 ;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 11: Écrivez un programme java qui renvoie le plus grand entier dans un tableau.
        
        int [] tab = {1, 2, 9, 4} ;
        
        int plusGrand = 0 ;


        for (int n = 0; n < tab.length; n++) {
            if (tab [n] > tab [n+1]){
                plusGrand = tab [n] ;
                System.out.println("le nombre le plus grand est : " + plusGrand);

            

            }

        }

       
       



        scanner.close();
       





    }
}
