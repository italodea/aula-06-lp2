package br.ufrn.imd;

public class Prova {
    double notaParte1;
    double notaParte2;


    public double calcularNotaTotal(){
        double notaFinal = this.notaParte1 + this.notaParte2;
        if(notaFinal >= 10){
            return notaFinal;
        }
        return notaFinal;
    }

    public double getNotaParte1() {
        return notaParte1;
    }

    public void setNotaParte1(double notaParte1) {
        this.notaParte1 = notaParte1;
    }

    public double getNotaParte2() {
        return notaParte2;
    }

    public void setNotaParte2(double notaParte2) {
        this.notaParte2 = notaParte2;
    }
}
