/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author 0041432413006
 */
public class Carro extends Veiculos{
    
    public Carro(int rodas) {
        super(rodas);
    }

    @Override
    public void abastecer() {
        System.out.println("Veiculo abastecendo");
    }
    
    public void imprimir_navegacao(){
        super.navegar();
    }

    @Override
    public void ligar() {
        System.out.println("O carro liga");
    }
    
}
