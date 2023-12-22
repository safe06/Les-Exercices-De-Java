package Exo8 ;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 8 : Écrire un programme en Java qui  permet de saisir 10 entiers dans un tableau. 
        //- compter combien y a-t-il  d'éléments pairs et  impairs.
        //- mettre les éléments pairs dans  un tableau T1 et les éléments impaires dans un tableau T2. 
        //- Puis afficher T1  et  T2

        int [] tab = new int [10] ;
       
        for ( int i = 0; i < tab.length; i++) {
          
            System.out.println("saisir le " + i +" élément du tableau");
            tab [i] = scanner.nextInt() ;
            System.out.println(i);

        }

        int nbrPair = 0 ;
        int nbrImpair = 0;
        for ( int i = 0; i < tab.length; i++) {
            if (tab [i] %2 == 0) {
                nbrPair++;
            }

            else {
                nbrImpair++;
            }

        }

        int [] tabT1 = new int [nbrPair] ;
        int [] tabT2 = new int [nbrImpair] ;

        int indextabT1 = 0 ;
        int indextabT2 = 0 ;

        for (int i = 0; i < tab.length; i++) {
            if ( tab [i] %2 == 0) {
                tabT1 [indextabT1++] = tab [i] ;
            
            }

            else {
                tabT2 [indextabT2++] = tab [i] ;
            }
        }
        System.out.println(" le tableau des nombres pair est :");
            for (int i = 0; i < tabT1.length; i++) {
                System.out.println(tabT1[i] );
            }


        System.out.println("le tableau des nombres impair est :" );
            for ( int i =0; i < tabT2.length; i++) {
                System.out.println(tabT2[i]);
            }




        scanner.close();
       





    }
}

