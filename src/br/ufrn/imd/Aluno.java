package br.ufrn.imd;

public class Aluno {
    Prova prova1;
    Prova prova2;

    public double calcularMedia(){
        double notaFinal = (this.prova1.calcularNotaTotal() + this.prova2.calcularNotaTotal())/2;

        return notaFinal;
    }

    public Prova getProva1() {
        return prova1;
    }

    public void setProva1(Prova prova1) {
        this.prova1 = prova1;
    }

    public Prova getProva2() {
        return prova2;
    }

    public void setProva2(Prova prova2) {
        this.prova2 = prova2;
    }
}
