
package radianes_seno_coseno;
  import java.util.Scanner;
/**
 *
 * @author Jean Paul MosqueraA
 */
//Definir clase
public class Angulo {
    
    //Definir metodo principal
    public static void main(String[] args) {
        //Definir Variables
        double anguRad;
        double seno;
        double coseno;
    
    //Objeto tipo Scanner para entrada mediante Teclado
        Scanner ingreso = new Scanner(System.in);
       
    //Solicitud de datos Usuario
        System.out.print("Ingrese la medida del angulo (Radianes):");
        anguRad= ingreso.nextDouble();

    //Obtención del Seno y Coseno mediante clase MATH 
        seno = Math.sin(anguRad);
        coseno = Math.cos(anguRad);
        
    //Impresión de valores
        System.out.println("                        ");
        System.out.println("Los valores del seno y coseno del angulo " + anguRad +" son:");
        System.out.println("Seno= " +seno);
        System.out.println("Coseno= " +coseno);
        
    //Variante sin almacenar valor de seno y coseno en variable :
        System.out.println("                        ");
        System.out.println("Variante sin almacenar valor de seno y coseno en variable");
        System.out.println(" El coseno del Angulo  " + anguRad + " es = " + Math.cos(anguRad));
        System.out.println("El seno del Angulo " + anguRad + " es = " + Math.sin(anguRad));
    }  
}
