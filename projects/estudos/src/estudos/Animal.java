/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

/**
 *
 * @author User
 */
public abstract class Animal implements Mover{
    
    private String raca;
    private int idade;
    private Double peso;
    
    public Animal(String raca, int idade, Double peso){
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        System.out.println("raça do animal: " + raca + " idade: "+ idade + " peso: " + peso);
    }
    
    public abstract void comer();
    
    public abstract void beber();
    
    public abstract void envelhecer(); 
            
}
