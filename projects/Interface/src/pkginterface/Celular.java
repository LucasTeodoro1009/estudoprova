/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author 0041432413006
 */
public class Celular extends Disp_eletronicos{
    
    public Celular(String modeloTela) {
        super(modeloTela);
    }

    @Override
    public void carregar() {
        System.out.println("Dispositivo carregando");
    }


    @Override
    public void navegar() {
        System.out.println("O celular navega                                                                                                                             ");
    }

    @Override
    public void ligar() {
        System.out.println("O celular liga");
    }
    
}
