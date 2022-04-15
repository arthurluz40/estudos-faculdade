/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questão.pkg4;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Questão4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declarando variavel
        int numero=0;
        int quadrado=0;
        int raiz=0;
        
        
        //lendo as variaveis
        Scanner leia=new Scanner(System.in);
        System.out.print("Digite o numero:");
        numero=leia.nextInt();
        //fazendo o caluculo
        quadrado=(int) Math.pow(numero,2);
        raiz=(int)Math.sqrt(numero);
        //imprimindo o resultando
        System.out.println("o numero ao quadrado é:"+quadrado);
        System.out.print("a raiz do numero é:"+raiz);
        
        
    
        
        
        
        
    }
    
}
