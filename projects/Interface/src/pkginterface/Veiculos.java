/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author 0041432413006
 */
public abstract class Veiculos implements GPS, Ligacao{
    
    private int rodas;
    
    public abstract void abastecer();
    
    //construtor
    public Veiculos(int rodas){
         this.rodas = rodas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    
    @Override
    public void navegar() {
        System.out.println("O carro navega");
    }
    
}
