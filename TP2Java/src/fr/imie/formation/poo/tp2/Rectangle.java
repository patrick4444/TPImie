package fr.imie.formation.poo.tp2;

public class Rectangle extends Shape {
	
	private Float width ;
	private Float height;
	
	// constructeur 
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public Float area() {
		return this.width * this.height;
	}

	@Override
	public Float perimetre() {
		float perimetre;
		perimetre = ((this.width + this.height) * 2);
		return perimetre;
	}

}
