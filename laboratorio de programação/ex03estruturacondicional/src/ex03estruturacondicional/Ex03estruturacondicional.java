/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex03estruturacondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero,n1,n2,n3,n4,aux,primeira,segunda,soma,calculo;
        Scanner leia=new Scanner(System.in);
        System.out.print("Digite um numero:");
        numero=leia.nextInt();
        n1=numero/1000;
        //separando os numeros
        aux=numero%1000;
        n2=aux/100;
        aux=aux%100;
        n3=aux/10;
        n4=aux%10;
        //separando as partes
        primeira=(n1*10)+n2;
        segunda=(n3*10)+n4;
        //fazendo os calculos
        soma=primeira+segunda;
        calculo=(int)Math.pow(soma,2);
        //condições
        if(numero==calculo){
            System.out.println("O numero possui tal caracteristica");
            
        }else{
            System.out.println("o numero não possui tal caracteristica");
        }
        
        
        
        
                
        
        
        
      
        
        
        
    }
    
}
