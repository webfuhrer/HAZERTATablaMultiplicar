/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

/**
 *
 * @author Admin
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n_tabla=EntradaSalida.preguntarNumeroTabla();
       for(int i=0; i<=10; i++)
       {
           EntradaSalida.mostrarMultiplicacion(n_tabla, i);
       }
    }
    
}
