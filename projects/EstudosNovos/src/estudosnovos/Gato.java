/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudosnovos;

/**
 *
 * @author User
 */
public class Gato extends Animal{
    
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void comer(){
        System.out.println("O gato esta comendo");
    }
    
    @Override
    public void beber(){
        System.out.println("O gato esta bebendo leite");
    }
    
    @Override
    public void tempo_vida(){
        System.out.println("O gato pode viver 15 anos");
    }
    
    @Override
    public void locomover(){
        System.out.println("O gato esta pulando");
    }
}
