/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author ejmcc
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operações aritmeticas sobre reais
        // Operadores Aritméticos: +, -, *, /, %
        // Funções Matemáticas: pow, sqrt e pi
        
        float vi1 = 5;
        float vi2 = 2;
        //Adicionar
        float viR = vi1+vi2;
        System.out.println(vi1 + " + " + vi2 + "= " + viR);
        //Subtrair
        viR = vi1-vi2;
        System.out.println(vi1 + " - " + vi2 + "= " + viR);
        //Multiplicar
        viR = vi1*vi2;
        System.out.println(vi1 + " * " + vi2 + "= " + viR);
        //Dividir 
        viR = vi1/vi2;
        System.out.println(vi1 + " / " + vi2 + "= " + viR);
        //Raiza quadrada
        viR = (float)Math.sqrt(vi1);
        System.out.println("Raiz Quadrada:  " + viR);
        System.out.println("Raiz Quadrada:  " + Math.sqrt(vi1));
        //Potencia
        viR = (float)Math.pow(vi1,vi2);
        System.out.println("Raiz Quadrada:  " + viR);
        System.out.println("Raiz Quadrada:  " + Math.pow(vi1,vi2));
        //Valor do PI
        System.out.println("Valor do PI Inteiro " + (float)Math.PI);
        
    }
}
