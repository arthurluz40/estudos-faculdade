/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      float base=0;
      float altura=0;
      float volume=0;
      Scanner leia = new Scanner(System.in);
      System.out.print("digite a base:");
      base=leia.nextFloat();
      System.out.print("Digite a altura");
      altura=leia.nextFloat();
      volume=(float)1/3 * base * altura;
      
      System.out.print("O volume e:" + volume);
      
      
     
  
     
   
            
      
      
              
              
    }
    
}
