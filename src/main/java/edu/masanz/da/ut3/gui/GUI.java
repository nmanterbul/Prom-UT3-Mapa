package edu.masanz.da.ut3.gui;

import java.util.Scanner;

public class GUI {

    public static  void dibujarMapa(int numFilas, int numColumnas, int filaP, int colP){

        for (int fila = 0; fila < numFilas; fila++) {

            for (int columna = 0; columna < numColumnas; columna++) {

                if (fila == 0 || fila == numFilas-1 || columna == 0 || columna == numColumnas-1) {
                    System.out.print("[*]");

                }else if(columna == colP && fila == filaP){
                    System.out.print("[P]");
                }
                else {
                    System.out.print("[ ]");
                }

            }
            System.out.println();
        }
    }

    public static void mostrarInformacion(int filaP, int colP){

        System.out.println();
        System.out.println("TE EENCUENTRAS EN: "+filaP+","+colP);
    }

    public static String obtenerAccion(){
        System.out.println();
        System.out.print("Elije una accion: ");
        Scanner teclado = new Scanner(System.in);
        String accion = teclado.nextLine().toUpperCase();

        return accion;
    }
}
