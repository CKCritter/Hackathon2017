
public abstract class Entity {
	
	//The sprite that represents the entity
	protected String image;
	protected double height, width;
	
	//postition on screen - bottom left corner is 0,0
	protected double x,y;
	
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
