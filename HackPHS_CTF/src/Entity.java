
public class Entity {
	
	//The sprite that represents the entity
	protected String image;
	protected double length, width;
	
	//position on screen - bottom left corner is 0,0
	protected double x,y;
	
	public Entity(String im, double l, double w, double x, double y)
	{
		image = im;
		length = l;
		width = w;
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		StdDraw.picture(x, y, image);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String getImage() {
		return image;
	}
	
	public double distance (Entity other) {
		return Math.sqrt((other.getX() - x) * (other.getX() - x) + (other.getY() - y) * (other.getY() - y));
	}
	
	public void move(Vector v)
	{
		x += v.getSpeed() * (x - v.getX());
		y += v.getSpeed() * (y - v.getY());
	}
}
