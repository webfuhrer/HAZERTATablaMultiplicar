/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class EntradaSalida {
    static int preguntarNumeroTabla()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿De qué número quieres sacar la tabla?");
        int n=sc.nextInt();
        return n;
    }

    static void mostrarMultiplicacion(int n_tabla, int i) {
        
        System.out.println(n_tabla+"x"+i+"="+(n_tabla*i));
    }
}
