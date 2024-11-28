/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

/**
 *
 * @author User
 */
public class Cachorro extends Animal{
    
    public Cachorro(String raca, int idade, Double peso){
        super(raca, idade, peso);
    }
    
    @Override
    public void mover(){
        System.out.println("O cachorro esta se movendo");
    }
    
    @Override
    public void comer(){
        System.out.println("O cachorro esta comendo");
    }
    
    @Override 
    public void beber(){
        System.out.println("O cachorro esta bebendo água");
    }
    
    @Override
    public void envelhecer(){
        System.out.println("O cachorro envelheceu um ano");
    }
    
}
