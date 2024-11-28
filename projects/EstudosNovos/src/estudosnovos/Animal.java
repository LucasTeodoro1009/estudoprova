/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudosnovos;

/**
 *
 * @author User
 */
public abstract class Animal implements Locomover{
    
    String nome;
    int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("O nome do pet eh: " + nome + " idade do pet: " + idade);
    }
    
    public void locomover(){
        System.out.println("Animal se locomovendo");
    }
    
    public abstract void comer();
    
    public abstract void beber();
    
    public abstract void tempo_vida();
}
