
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
}
