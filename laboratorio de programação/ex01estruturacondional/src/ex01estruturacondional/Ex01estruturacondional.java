/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01estruturacondional;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex01estruturacondional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=0;
        Scanner leia=new Scanner(System.in);
        System.out.print("Digite um numero:");
        numero=leia.nextInt();
        if(numero % 2 ==0){
            System.out.println("Par");
        }else{
            System.out.println("ímpar");
        }
    }
    
}
