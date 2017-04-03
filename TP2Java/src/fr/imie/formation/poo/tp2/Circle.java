package fr.imie.formation.poo.tp2;

public class Circle extends Shape {

	private float radius;
	private float width ;
	private float height;
	
	// constructeur 
	public Circle(float width, float height, float radius) {
		this.width = width;
		this.height = height;
		this.radius = radius;
	}
	
	@Override
	public Float area() {
		final float pi = 3.14f; 
		return pi * radius * radius;
	}

	@Override
	public Float perimetre() {
		// TODO Auto-generated method stub
		return null;
	}

}
