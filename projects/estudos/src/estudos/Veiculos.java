/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudos;

/**
 *
 * @author User
 */
public abstract class Veiculos implements Mover{
    
    private String marca;
    private String cor;
    private int  ano;
    
    public Veiculos(String marca,String cor,int ano){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        System.out.println("Carro: "+ marca + " ano: "+ ano + " cor: "+ cor);
    }
    
    public abstract void abastecer(Double litros);
    
    public abstract Double quilometragem(Double km);
    
    public abstract String dono(String nome);
    
}
