/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author ejmcc
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operações aritmeticas sobre reais
        // Operadores Aritméticos: +, -, *, /, %
        // Funções Matemáticas: pow, sqrt e pi
        
        double vi1 = 5;
        double vi2 = 2;
        //Adicionar
        double viR = vi1+vi2;
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
        viR = Math.sqrt(vi1);
        System.out.println("Raiz Quadrada:  " + viR);
        System.out.println("Raiz Quadrada:  " + Math.sqrt(vi1));
        //Potencia
        viR = Math.pow(vi1,vi2);
        System.out.println("Raiz Quadrada:  " + viR);
        System.out.println("Raiz Quadrada:  " + Math.pow(vi1,vi2));
        //Valor do PI
        System.out.println("Valor do PI Inteiro " + Math.PI);
        
    }
}
