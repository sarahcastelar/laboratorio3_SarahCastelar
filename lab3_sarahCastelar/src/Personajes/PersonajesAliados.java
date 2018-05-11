
package Personajes;


public class PersonajesAliados extends PersonajesGeneral{
     
    private int suerte;
    private String colorPiel;
    private String colorPelo;

    public PersonajesAliados(int suerte, String colorPiel, String colorPelo, int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        super(hp, ad, eficacia, probCritico, velocidad, gritoBatalla, edad, nombre, estatura, peso, raza);
        this.suerte = suerte;
        this.colorPiel = colorPiel;
        this.colorPelo = colorPelo;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
    




}
    
    

    