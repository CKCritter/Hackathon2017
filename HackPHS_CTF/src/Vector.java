
public class Vector {
	
	private double x;
	private double y;
	//private double speed;
	
	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
		//this.speed = speed;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	/*public double getSpeed()
	{
		return speed;
	}*/
	
	public double dotProd(Vector other) {
		return this.x * other.x + this.y * other.y;
	}
	
	public Vector plus(Vector other) {
		return new Vector(this.x + other.x, this.y + other.y);
	}
	
	public Vector minus(Vector other) {
		return new Vector(this.x - other.x, this.y - other.y);
	}
	
	public Vector times(double k) {
		return new Vector(k*this.x, k*this.y);
	}
	
	public double mag() {
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	
	public double angle() { 
		return Math.atan(this.y / this.x);
	}
}
