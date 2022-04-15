/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questão.pkg5;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Questão5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarando as variaveis
        float tv=0;
        float vm=0;
        float distancia=0;
        float ql=0;
        double custo=0;
        
        //lendo as variaveis
        Scanner leia=new Scanner(System.in);
        System.out.print("Forneça o tempo de viagem");
        tv=leia.nextFloat();
        System.out.print("Forneça a velocidade media");
        vm=leia.nextFloat();
        //fazendo o calculo
        distancia=tv*vm;
        ql=distancia/12;
        custo= ql*5.90;
        //mostrando o resultado
        
         System.out.print("o custo da viagem é"+custo);
         
        
      
        
        
                
             
        
          
          
        
        
        
    }
    
}
