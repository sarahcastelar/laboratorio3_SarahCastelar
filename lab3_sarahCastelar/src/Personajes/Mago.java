
package Personajes;

public class Mago extends PersonajesAliados{
    
    private int ap;

    public Mago(int suerte, String colorPiel, String colorPelo, int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso) {
        super(20, colorPiel, colorPelo, 120, 20, 70, 2, 10, "shwshhh", edad, nombre, estatura, peso);
    }

    
    
    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }
    
    
    
    

   

    
    

    
    
    
    
    
    
    
    
}
