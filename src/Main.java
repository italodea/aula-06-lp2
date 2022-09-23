import br.ufrn.imd.Aluno;
import br.ufrn.imd.Prova;
import br.ufrn.imd.Turma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();


        System.out.println("Aluno 1 ------------------------------------------");
        for (int i = 1; i <= 2; i++) {
            Prova prova = new Prova();
            for (int j = 1; j <= 2; j++) {
                System.out.print("Nota " + j + " da prova " + i + ": ");
                if (j == 1) {
                    prova.setNotaParte1(Double.parseDouble(sc.nextLine()));
                } else {
                    prova.setNotaParte2(Double.parseDouble(sc.nextLine()));
                }
            }
            if (i == 1) {
                aluno1.setProva1(prova);
            } else {
                aluno1.setProva2(prova);
            }
        }

        System.out.println("Aluno 2 ------------------------------------------");

        for (int i = 1; i <= 2; i++) {
            Prova prova = new Prova();
            for (int j = 1; j <= 2; j++) {
                System.out.print("Nota " + j + " da prova " + i +": ");
                if (j == 1) {
                    prova.setNotaParte1(Double.parseDouble(sc.nextLine()));
                } else {
                    prova.setNotaParte2(Double.parseDouble(sc.nextLine()));
                }
            }
            if (i == 1) {
                aluno2.setProva1(prova);
            } else {
                aluno2.setProva2(prova);
            }
        }

        System.out.println("Aluno 3 ------------------------------------------");

        for (int i = 1; i <= 2; i++) {
            Prova prova = new Prova();
            for (int j = 1; j <= 2; j++) {
                System.out.print("Nota " + j + " da prova " + i +": ");
                if (j == 1) {
                    prova.setNotaParte1(Double.parseDouble(sc.nextLine()));
                } else {
                    prova.setNotaParte2(Double.parseDouble(sc.nextLine()));
                }
            }
            if (i == 1) {
                aluno3.setProva1(prova);
            } else {
                aluno3.setProva2(prova);
            }
        }

        Turma turma1 = new Turma();
        turma1.setAluno1(aluno1);
        turma1.setAluno2(aluno2);
        turma1.setAluno3(aluno3);

        System.out.println("\n\n");

        System.out.println("Aluno 1 ========================================");
        System.out.println("Prova 1: "+ aluno1.getProva1().calcularNotaTotal());
        System.out.println("Prova 2: "+ aluno1.getProva2().calcularNotaTotal());
        System.out.println("Média final: "+ aluno1.calcularMedia());

        System.out.println("\n\n");

        System.out.println("Aluno 2 ========================================");
        System.out.println("Prova 1: "+ aluno2.getProva1().calcularNotaTotal());
        System.out.println("Prova 2: "+ aluno2.getProva2().calcularNotaTotal());
        System.out.println("Média final: "+ aluno2.calcularMedia());

        System.out.println("\n\n");

        System.out.println("Aluno 3 ========================================");
        System.out.println("Prova 1: "+ aluno3.getProva1().calcularNotaTotal());
        System.out.println("Prova 2: "+ aluno3.getProva2().calcularNotaTotal());
        System.out.println("Média final: "+ aluno3.calcularMedia());

        System.out.println("\n\n");

        System.out.println("Turma ========================================");
        System.out.println("Média da turma: " + turma1.calcularMedia());
    }
}
