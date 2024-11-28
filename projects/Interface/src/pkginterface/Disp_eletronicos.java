/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author 0041432413006
 */
public abstract class Disp_eletronicos implements GPS, Ligacao{
    
    private String modeloTela;
    
    public abstract void carregar();

    public Disp_eletronicos(String modeloTela) {
        this.modeloTela = modeloTela;
    }
    
    public String getModeloTela() {
        return modeloTela;
    }

    public void setModeloTela(String modeloTela) {
        this.modeloTela = modeloTela;
    }
    
    
}
