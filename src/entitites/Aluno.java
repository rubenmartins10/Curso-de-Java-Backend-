package entitites;

public class Aluno {
	public String name;
	public double nota;
	public double nota1;
	public double nota2;
	
	public double notaFinal() {
        return (nota * 0.30) + (nota1 * 0.35) + (nota2 * 0.35);
    }
	
	public double missingPoints() {
		if (notaFinal() < 50.0) {
			return 50.0 - notaFinal();
	    } else {
	        return 0.0;
	    }
	}	
}
