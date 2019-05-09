/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        Desarrollar una aplicacion que me permita ingresar placas de carros
        Se asume que las placas ingresadas pertenecen a la región costa del
        Ecuador, en base a la placa el programa determinará y presentará la 
        placa con la provincia a la que pertenece 
        */
        Scanner teclado = new Scanner (System.in);
        String placa = "";
        System.out.println("Por favor ingrese su placa");
        placa = teclado.nextLine();
        char valor = placa.charAt(0);
                
        switch(valor){
            
            case 'g':
            case'G':
                System.out.printf("Su placa inicia con  %s por lo que es de "
                        + "%s\n",valor, "Guayas");
                break;
            case 'o':
            case'O':
                System.out.printf("Su placa inicia con  %s por lo que es de "
                        + "%s\n",valor, "El Oro");
                break;
            case 'e':
            case'E':
                System.out.printf("Su placa inicia con  %s por lo que es de "
                        + "%s\n",valor, "Esmeraldas");
                break;
            case 'm':
            case'M':
                System.out.printf("Su placa inicia con  %s por lo que es de "
                        + "%s\n",valor, "Manabi");
                break;
            case 'r':
            case'R':
                System.out.printf("Su placa inicia con  %s por lo que es de "
                        + "%s\n",valor, "Los Ríos");
                break;
            case 'y':    
            case'Y':
                System.out.printf("Su placa inicia con  %s por lo que es de "
                        + "%s\n",valor, "Santa Elena");
                break;
                
            default:
                System.out.println("Su placa no es de la Region Costa");
                
        }
        
    }
}
