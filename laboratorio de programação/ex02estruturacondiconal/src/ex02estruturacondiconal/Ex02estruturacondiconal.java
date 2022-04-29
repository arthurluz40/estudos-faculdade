/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02estruturacondiconal;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex02estruturacondiconal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float salario=0;
     double aumento=0;
      Scanner leia=new Scanner(System.in);
        System.out.print("Digite seu salário:");
        salario=leia.nextFloat();
        if(salario<=1050){
            aumento=salario +(salario*0.5);
            System.out.println("O seu salário reajustado é "+ aumento);
                    }else if(salario>1050){
                        aumento= salario + (salario + 0.3);
                        System.out.println("O seu salário reajustado é"+aumento);
                    }
    }
    
}
