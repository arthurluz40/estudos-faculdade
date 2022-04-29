/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aprendendo;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Aprendendo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //Declarando as variaveis
      float n1=0;
      float n2=0;
      float n3=0;
      float mf=0;
      Scanner leia = new Scanner(System.in);
        System.out.print("N1:");
        n1=leia.nextFloat();
        System.out.print("N2:");
        n2=leia.nextFloat();
        System.out.print("N3:");
        n3=leia.nextFloat();
        mf=(n1*2)+(n2*3)+(n3*5)/10;
        System.out.println("a media final é"+mf);
    }
}
        