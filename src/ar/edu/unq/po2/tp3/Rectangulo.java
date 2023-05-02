package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Point punto1;
	private Point punto2;
	private Point punto3;
	private Point punto4;
	
	Rectangulo(Point punto1, Point punto2, Point punto3, Point punto4) {
		this.punto1 = punto1;
		this.punto2 = punto2;
		this.punto3 = punto3;
		this.punto4 = punto4;
	}

	public Point getPunto1() {
		return punto1;
	}

	public void setPunto1(Point punto1) {
		this.punto1 = punto1;
	}

	public Point getPunto2() {
		return punto2;
	}

	public void setPunto2(Point punto2) {
		this.punto2 = punto2;
	}

	public Point getPunto3() {
		return punto3;
	}

	public void setPunto3(Point punto3) {
		this.punto3 = punto3;
	}

	public Point getPunto4() {
		return punto4;
	}

	public void setPunto4(Point punto4) {
		this.punto4 = punto4;
	}

	public int área() {
	
		return base()*altura();
	}
	
	private int base() {
		return Math.abs(punto1.getX() - punto2.getX());
	}
	
	private int altura() {
		return Math.abs(punto1.getY() - punto3.getY());
	}
	
	public int perímetro() {
		
		int baseTotal   = base()*2;
		int alturaTotal = altura()*2;
		
		return baseTotal+alturaTotal;
	}
	
}






















