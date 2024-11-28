/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

/**
 *
 * @author User
 */
public class Carro extends Veiculos{

    public Carro(String marca, String cor, int ano){
        super(marca, cor, ano);
    }
    
    @Override
    public void abastecer(Double litros){
        System.out.println("Este carro tem capacidaded para abastecer até " + litros + "litros.");
    }
    
    @Override
    public String dono(String nome){
        System.out.println("O dono deste carro é "+ nome);
        return nome;
    }
    
    @Override
    public Double quilometragem(Double km){
        System.out.println("Este carro ja rodou "+ km + "KM");
        return km;
    }
    
    
    @Override
    public void mover(){
        System.out.println("Este carro esta se movendo no momento");
    }
}
