/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex04estruturacondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=0;
        double raiz;
        
        Scanner leia=new Scanner(System.in);
        System.out.print("Digite um numero:");
        numero=leia.nextInt();
        raiz=Math.sqrt(numero);
        if(raiz%1==0){
            System.out.println("o numero é um quadrado perfeito");
        }else{
            System.out.println("o numero não é um quadrado perfeito");
        }
        
        
        
    }
    
}
