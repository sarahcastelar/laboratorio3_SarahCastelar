package Personajes;

import java.util.Random;

public class Bruja extends PersonajesEnemigos {
    Random r = new Random();
    
    protected int ap;
    
    public Bruja(int ap, int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        super(hp, ad, eficacia, 1, velocidad, "Muajaja", edad, "Bruja", estatura, peso, raza);
        this.ap = 5 + r.nextInt(10);
        this.hp = 60 + r.nextInt(80);
        this.ad = 20 + r.nextInt(40);
        this.eficacia = 10 + r.nextInt(30);
        this.velocidad = 3 + r.nextInt(7);
    }
    
    
    
}
