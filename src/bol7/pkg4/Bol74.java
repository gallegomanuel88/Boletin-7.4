package bol7.pkg4;

/**
 *
 * @author galle
 */
public class Bol74 {

    public static void main(String[] args) {
        Comparacion persona1 = new Comparacion();
        Comparacion persona2 = new Comparacion();
        persona1.setNombre(persona1.darNombre());
        persona1.setPeso(persona1.darPeso());
        persona2.setNombre(persona2.darNombre());
        persona2.setPeso(persona2.darPeso());
        Comparacion.compararPesos(persona1, persona2);
    }
    
}
