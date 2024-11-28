/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author 0041432413006
 */
public class PoliMorfismo {
    public static void main(String[] args) {
        
        Animal a;
        
        double peso;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o peso do peixo: ");
        peso = sc.nextDouble();
        
        a = new Peixe(peso);
        //a.mover();
        a.setPeso(peso);
        a.getPeso();
        
        System.out.println("Digite o peso do peixo: ");
        peso = sc.nextDouble();
        
        a = new Sapo(peso);
        //a.mover();
        a.setPeso(peso);
        a.getPeso();
        
        System.out.println("Digite o peso do peixo: ");
        peso = sc.nextDouble();
        
        a = new Passaro(peso);
        //a.mover();
        a.setPeso(peso);
        a.getPeso();
        
    }  
}
