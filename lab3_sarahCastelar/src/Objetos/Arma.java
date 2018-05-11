
package Objetos;

public class Arma extends ObjetosGeneral{
    
    private int ArmaBlanca;
    private int ArmaNegro;
    private int espada;
    private int martillo;

    public Arma(int ArmaBlanca, int ArmaNegro, int espada, int martillo, String nombre, String tipo) {
        super(nombre, tipo);
        this.ArmaBlanca = 10;
        this.ArmaNegro = 15;
        this.espada = 10;
        this.martillo = 5;
    }
    
    
    
}
