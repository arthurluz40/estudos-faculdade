/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questão.pkg3;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Questão3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        int x1=0;
        int x2=0;
        int y1=0;
        int y2=0;
        int d=0;
        
        Scanner leia = new Scanner(System.in);
        System.out.println("dados do ponto a:");
        System.out.println("x1:");
        x1=leia.nextInt();
        System.out.println("y1:");
        y1=leia.nextInt();
        System.out.println("Dados do ponto b:");
        System.out.println("x2:");
        x2=leia.nextInt();
        System.out.println("y2");
        y2=leia.nextInt();
        d=(int) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("A distancia é de:"+ d +"metros.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
     
    }
    
}
