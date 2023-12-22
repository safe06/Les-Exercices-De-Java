package Exo4 ;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 4 :
        // Une boutique propose à ses clients, une réduction de 15% pour les montants d’achat supérieurs à 200 Euros. 
        //Écrire un programme en Java permettant de saisir le prix total HT 
        //et de calculer le  montant TTC en prenant en compte la réduction et la TVA=20%. 

        System.out.println("Saisir un montant d'achat: ");
        double p = scanner.nextDouble();
        System.out.println(p);

        double prixAprésRéduction = p - (p * 0.15) ;
        System.out.println(prixAprésRéduction);

        double tva = p * 0.20 ;
        System.out.println(tva);

    

        if (p > 200) {
            System.out.println("le montant final est : " + (prixAprésRéduction + tva));

        }
        else {
            System.out.println("le montant final est " + (p+tva));
        }

        scanner.close();



    }
}
