/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudos;

/**
 *
 * @author User
 */
//import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        
        Carro objeto = new Carro("uno", "preto", 2001);  
        //System.out.println("digite o valor");
        //valor = sc.next() para texto
        // valor = sc.nextDouble() para numero quebrado
        // valor = sc.nextInt() para numero inteiro
        
        objeto.abastecer(45.00);
        objeto.dono("Fulano");
        objeto.quilometragem(2341.87);
        objeto.mover();
        
        Animal aaa;
        
        aaa = new Cachorro("Labrador", 4, 32.00);
        
        aaa.comer();
        aaa.beber();
        aaa.envelhecer();
        aaa.mover();
        
        
        aaa = new Gato("NS raça de gato", 6, 19.00);
        
        aaa.comer();
        aaa.beber();
        aaa.envelhecer();
        aaa.mover();
        
    }
}
