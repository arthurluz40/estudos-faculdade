/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex05estruturacondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sexo;
        float altura=0;
        double pesoidealh=0;
        double pesoidealm=0;
        Scanner leia=new Scanner(System.in);
        System.out.print("Qual o seu sexo?");
        sexo=leia.nextLine();
        System.out.print("Digite a sua altura");
        altura=leia.nextFloat();
        if(sexo == "h"){
            pesoidealh=72.7*altura-58;
            System.out.println("O seu peso ideal é"+ pesoidealh);
        }
        if(sexo=="m"){
            pesoidealm=62.1*altura-44.7;
            System.out.println("O seu peso ideal é"+ pesoidealm);
        }
        
            
            
            
        }
        
        
        
        
        
    }
    

