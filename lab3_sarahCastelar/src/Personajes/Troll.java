
package Personajes;

import java.util.Random;


public class Troll extends PersonajesEnemigos{
    Random r = new Random();
    
    public Troll(int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        super(hp, ad, eficacia, probCritico, 10, "jrrr", edad, "Troll", estatura, peso, raza);
        this.hp = 50 + r.nextInt(80);
        this.ad = 30 + r.nextInt(50);
        this.eficacia = 15 + r.nextInt(20);
        
    }
    
}
