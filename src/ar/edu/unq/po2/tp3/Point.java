package ar.edu.unq.po2.tp3;

public class Point {

	private int x;
	private int y;
	
	
	
	Point() {
		this.x = 0; //Valor por defecto.
		this.y = 0; //Valor por defecto.
	}



	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	public Point moverPunto(int z, int k) {
		
		int nuevaCoordenadaX = z;
		int nuevaCoordenadaY = k;
		 
		return new Point(nuevaCoordenadaX, nuevaCoordenadaY);
		
	}
	
	public Point sumarPuntos(Point otherPoint) {
		
		 int nuevaCoordenadaX = this.x+otherPoint.getX();
		 int nuevaCoordenadaY = this.y+otherPoint.getY();
		 
		 return new Point(nuevaCoordenadaX, nuevaCoordenadaY);
		 
	}
	
}






