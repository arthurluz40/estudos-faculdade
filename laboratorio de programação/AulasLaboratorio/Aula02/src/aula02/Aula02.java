/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author ejmcc
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variáveis - inteiras, reais e String
        //Como declarar
        // tipo identificador = valor inicial
        // Tipos: int, float, double e String
        int valorInt = 10;
        float valorFloat = 10.12345f;
        double valorDouble = 19.123456789;
        String valorString = "Godofredo da Silva";
   
        // Comando e saida de dados
        //Comando de saida - Como escrever na tela
        System.out.println("Valor da Variével Inteira: " + valorInt);
        System.out.println("Valor da Variável Float: " + valorFloat);
        System.out.println("Valor da Variável Double: " + valorDouble);
        System.out.println("Valor da Variável String: " + valorString);
        
        //Saida formatada de uma variável real
        System.out.printf("Numero float: %.2f \n",valorFloat);
        System.out.printf("Numero double: %.3f \n",valorDouble);
        System.out.println();
        
    }
}
