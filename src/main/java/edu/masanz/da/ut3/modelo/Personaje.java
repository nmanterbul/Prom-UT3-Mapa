package edu.masanz.da.ut3.modelo;

public class Personaje {
   private int filaP;
   private int colP;

    public Personaje(int filaP, int colP) {
        this.filaP = filaP;
        this.colP = colP;
    }

    public int getFilaP() {
        return filaP;
    }

    public void setFilaP(int filaP) {
        this.filaP = filaP;
    }

    public int getColP() {
        return colP;
    }

    public void setColP(int colP) {
        this.colP = colP;
    }

}
