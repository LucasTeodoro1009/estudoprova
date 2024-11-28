/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author 0041432413006
 */
public class Passaro extends Animal{

    @Override
    public void mover() {
        System.out.println("O passaro voa!");
    }
    
    // Construtor
    public Passaro(double peso){
        super(peso);
    }
    
    public void setPeso(double peso) {
        super.setPeso(peso);
    }
    
    public double getPeso() {
        return super.getPeso();
    }
    
}
