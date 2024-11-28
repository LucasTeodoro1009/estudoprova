/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

/**
 *
 * @author User
 */
public class Gato extends Animal{
    
    public Gato(String raca, int idade, Double peso){
        super(raca, idade, peso);
    }
    
    @Override
    public void mover(){
        System.out.println("O gato esta escalando");
    }
    
    @Override
    public void comer(){
        System.out.println("O gaot esta comendo");
    }
    
    @Override 
    public void beber(){
        System.out.println("O gato esta bebendo leite");
    }
    
    @Override
    public void envelhecer(){
        System.out.println("O gato envelheceu um ano");
    }
    
}
