package exerciciosComProgramacaoOrientadaObjetos;

import java.util.Locale;
import java.util.Scanner;

import entitites.Aluno;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Name: ");
		aluno.name = sc.next();
		
		System.out.println("Nota do 1 trimestre: ");
		aluno.nota = sc.nextDouble();
		
		System.out.println("Nota do 2 trimestre: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Nota do 3 trimestre: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", aluno.notaFinal());
        
        if (aluno.notaFinal() < 50.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
        } else {
            System.out.println("PASS");
        }
		
		
		sc.close();

	}

}
