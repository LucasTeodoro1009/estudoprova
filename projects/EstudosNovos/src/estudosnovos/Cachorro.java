/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudosnovos;

/**
 *
 * @author User
 */
public class Cachorro extends Animal{
    
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void comer(){
        System.out.println("O cachorro esta comendo");
    }
    
    @Override
    public void beber(){
        System.out.println("O cachorro esta bebendo agua");
    }
    
    @Override 
    public void tempo_vida(){
        System.out.println("O cachorro pode viver 15 anos");
    }
    
    @Override
    public void locomover(){
        System.out.println("O cachorro esta correndo");
    }
}
