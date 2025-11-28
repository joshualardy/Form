/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g59648.dev1q2.Util;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author g59648
 */
public class util {
    public static double hasard( int min, int max){              
            double v = Math.random();
            return (Math.floor((1 + max - min)* v + min));
        }
     public static int posSiPair( int i){
        return(2*(i%2)-1);
     }
    public static int shuffleNb(int min, int max){ 
        //génère un nombre aléatoire entre deux valeures données !
        int nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));
        
        return nombreAleatoire;
    }
    public static int entrezUnNb(String message){
        //demande à l'utilisateur d'entrer un nombre
        System.out.println(message);
        Scanner kbd = new Scanner(System.in);
        int nbr = kbd.nextInt();
        
        return nbr;
    }
    public static void main(String[] args){
        System.out.print(shuffleNb(1, 100));
    }
    public static int[] afficher(int[] tab){ //exercice 2
        System.out.println(Arrays.toString(tab));
        return tab;
    }
}
