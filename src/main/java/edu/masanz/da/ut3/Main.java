package edu.masanz.da.ut3;

import edu.masanz.da.ut3.gui.GUI;
import edu.masanz.da.ut3.modelo.Mapa;
import edu.masanz.da.ut3.modelo.Personaje;

public class Main {
    public static void main(String[] args) {

        Mapa mapa = new Mapa(7,10);

       int numFils = mapa.getNumFils();
       int numCols = mapa.getNumCols();

        int filaP = 1;
        int colP = 1;

        Personaje nahia = new Personaje(filaP,colP);


        GUI.dibujarMapa(numFils,numCols, nahia.getFilaP(), nahia.getColP());
        GUI.mostrarInformacion(nahia.getFilaP(),nahia.getColP());

        while(true){

           String accion =  GUI.obtenerAccion();

           mapa.realizarAccion(nahia, accion);


            GUI.dibujarMapa(numFils,numCols, nahia.getFilaP(), nahia.getColP());
            GUI.mostrarInformacion(nahia.getFilaP(),nahia.getColP());
        }


        }
    }
