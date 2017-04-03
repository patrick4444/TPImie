package fr.imie.formation.poo.tp2;

public class ShapeTest {

	public static void main(String[] args) {
				
		final int height = 10;
		final int width = 20;
		
		Shape rectangle = new Rectangle(width, height);
		System.out.println("Aire du rectangle : " + rectangle.area());
		System.out.println("Perimetre du rectangle : " + rectangle.perimetre());
		
		//Action 6 ---
		//Circle circle = new Circle(10f);
		//printAreaOf();
		//System.out.println("Perimetre du cercle : " + circle.area());
		
	}

}
