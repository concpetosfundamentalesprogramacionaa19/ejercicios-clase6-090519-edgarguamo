/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
import java.util.Scanner;

/**
 *
 * @author Edgar Guamo
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        String mensaje_final = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        int contador = 1;
        
        mensaje_final = String.format("%s%s\n\n", mensaje_final,
                "Informe de la ciudad de Loja"); 
        mensaje_final = String.format("%s%s\n\n", mensaje_final,
                "Listado de personas"); 
        
        while (contador < 5){
            
            System.out.println("Ingrese sus nombres");
            nombre = teclado.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellido = teclado.nextLine();
            System.out.println("Ingrese su profesión");
            profesion = teclado.nextLine();
            mensaje_final = String.format("%sPersona %d: %s %s - %s\n", 
                    mensaje_final, contador, nombre, apellido, profesion);
            /*System.out.printf(" Personsa %d: %s %s - %s\n", contador, nombre, 
                    apellido, profesion); */
            contador = contador + 1; // para incrementar el contador            
        }
                
        System.out.printf("%s", mensaje_final);
    }
    
}
