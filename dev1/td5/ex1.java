/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g59648.dev1q2.td3;

import java.util.Scanner;

/**
 *
 * @author g59648
 */
public class ex1 {
    public static void exA(){
        for( int nb =-1; nb>=-7; nb--){
        System.out.print(nb+" ");
    }
}
    public static void exB(){
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        for (int nb=1; nb<=n; nb++){
            System.out.print(nb + " ");
            
        }
    }
    public static void exC(){
        for(int nb=2; nb<=15; nb=nb +2){
            System.out.print(nb + " ");
        }
    }
    public static void exD(){
        for(int nb=1; nb<=15; nb=nb +2){
            System.out.print(nb + " ");
        }
    }
    

    public static void main(String[] args){
        System.out.print("Les nombres de -1 à -7: ");
        exA();
        System.out.println("Les nombres de 1 à n: ");
        exB();
        System.out.println("Les nombres paires: ");
        exC();
        System.out.println("Les nombres impaires: ");
        exD();
    }
}
