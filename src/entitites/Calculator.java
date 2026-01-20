package entitites;

public class Calculator {
	
	public final double PI = 3.14159; //palavra final serve para dizer que o valor é constante e não dá para mudar, sempre em maiúsculas para constantes
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3;
	}
	
	
}
