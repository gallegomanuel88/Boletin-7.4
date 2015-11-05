package bol7.pkg4;
import javax.swing.JOptionPane;
/**
 *
 * @author galle
 */
public class Comparacion {

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
   private String nombre;
   private float peso;
   public Comparacion (){  
   }
   
   public Comparacion (String nombre, float peso){
       this.nombre = nombre;
       this.peso = peso;
   }
//   public void setAtributos(){
//       this.nombre = JOptionPane.showInputDialog("Introduce un nombre");
//       this.peso = Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso"));
//   }
   
   public String darNombre(){
       return (JOptionPane.showInputDialog("Intrpduce nombre"));
       
   }
   
   public float darPeso(){
       return (Float.parseFloat(JOptionPane.showInputDialog("Intrpduce peso")));
       
   }
   public static void compararPesos(Comparacion persona1,Comparacion persona2){
       if (persona1.peso>persona2.peso)
           System.out.println(persona1.nombre + " tiene mayor peso ");
       else if (persona2.peso>persona1.peso)
           System.out.print(persona2.nombre + " tiene mayor peso ");
       else 
           System.out.println(" Pesan lo mismo ");
           
   }
}
