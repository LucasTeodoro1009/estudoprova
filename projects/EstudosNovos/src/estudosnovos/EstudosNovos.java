/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudosnovos;
import java.util.Scanner;

public class EstudosNovos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        
        System.out.println("Informe o nome do cachorro: ");
        nome = sc.next();
        System.out.println("Informe a idade do cachorro: ");
        idade = sc.nextInt();
        
        Animal pet;
        
        pet = new Cachorro(nome, idade);
        
        pet.comer();
        pet.beber();
        pet.locomover();
        pet.tempo_vida();
        
        System.out.println("");
        System.out.println("Informe o nome do gato: ");
        nome = sc.next();
        System.out.println("Informe a idade do gato: ");
        idade = sc.nextInt();
        
        pet = new Gato(nome, idade);
        
        pet.comer();
        pet.beber();
        pet.locomover();
        pet.tempo_vida();
        
    }
    
}
