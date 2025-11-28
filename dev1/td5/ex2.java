/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g59648.dev1q2.td3;

/**
 *
 * @author g59648
 */
public class ex2 {
    public static void exeA(){
        int nb = 0;
        for(int i=1 ; i<=10; i++){
            nb = nb+2;
            System.out.print(nb + " ");
        }
    }
    
    public static void exeB(){
        int nb = 0;
        for(int i=0 ; i<=10; i++){
            nb= nb + 2;
            System.out.print(nb + " ");
        }
    }
    
    public static void exeC(){
        int nb = 1; int n = 10;
        for(int i=1; i<=n; i++){
            /* nb = -i*(int)Math.pow(-1, i);*/
             nb = i*(2*(i%2)-1);
            System.out.print(nb +" ");
                
            }   
        }
    public static void exeD(){
        int nb = 1; int n = 10;
        for(int i=1; i<=n; i++){
            nb = i%3;
            System.out.print(nb +" ");
                
            }   
        }
    
    public static void exeE(){
        int nb = 1; int n = 10;
        for(int i=0; i<=n; i++){
            nb = i%3;
            System.out.print(nb +" ");
                
            }   
        }
    public static void exeF(){
        int nb = 1; int n = 10;
        for(int i=1; i<=n; i++){
            nb = i*i;
            System.out.print(nb +" ");
                
            }   
        }
    public static void exeG(){
        int nb = 1; int n = 10;
        for(int i=1; i<=n; i++){
            nb = (int)Math.pow(2, i);
            System.out.print(nb +" ");
                
            }   
        }
    public static void exeH(){
        int nb = 1; int n = 10;
        for(int i=1; i<=n; i++){
            nb = nb+i;
            System.out.print(nb +" ");
                
            }   
        }
     public static void exeI(){
        int nb = 1; int n = 10;
        for(int i=1; i<=n; i++){
            nb = nb + i;
            System.out.print(nb +" ");
                
            }   
        }
    
    public static void exeJ(){
        int i,v; int n =10;
        v = 0;
        for( i =1; i <= n; i++){
            if(v <= 0){
                v = -v+1;
            }else{
                v = -v;
            }System.out.print(v + " ");
        }
    }
        
       
        
    
    
     public static void main(String[] args){
        System.out.println("La série de nombres paires à partir de 2 a): ");
         exeA();
        System.out.println(" ");
        System.out.println("La série de nombres paires à partir de 0 b):");
        exeB();
        System.out.println(" ");
        System.out.println("La série de nombres paires à partir de 1 sont négatifs c) :");
        exeC();
        System.out.println(" ");
        System.out.println("La série de nombres de 0 à 2 d) :");
        exeD();
        System.out.println(" ");
        System.out.println("La série de nombres de 0 à 2, en partant de zero e) :");
        exeE();
        System.out.println(" ");
        System.out.println("La série de nombres, chacun au carré f) :");
        exeF();
        System.out.println(" ");
        System.out.println("La série de nombres, des puissances de 2 g) :");
        exeG();
        System.out.println(" ");
        System.out.println("La série de nombres en additionnant i h) :");
        exeH();
        System.out.println(" ");
        System.out.println("La série de nombres en alternant positif et negatif j) :");
        exeJ();

     }
    
}
