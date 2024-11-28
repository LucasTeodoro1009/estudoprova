/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author 0041432413006
 */
public class Peixe extends Animal{

    @Override
    public void mover() {
        System.out.println("O peixe nada!");
    }
    
    // Construtor
    public Peixe(double peso){
        super(peso);
    }
    
    public void setPeso(double peso) {
        super.setPeso(peso);
    }
    
    public double getPeso() {
        return super.getPeso();
    }

    
    
}
