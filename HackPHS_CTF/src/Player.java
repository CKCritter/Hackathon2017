
public class Player extends Entity {
	
	protected int health = 100;
	protected Vector vec;
	
	public Player (String im, double l, double w, double x, double y, Vector v) {
		super(im,  l,  w,  x,  y);
		
		vec = v;
	}
	
	public void checkMovement()
	{
		int x = 0;
		int y = 0;
		
		if(StdDraw.isKeyPressed(87))
		{
			x += 1;
		}
		if(StdDraw.isKeyPressed(83))
		{
			x -= 1;
		}
		if(StdDraw.isKeyPressed(65))
		{
			y += 1;
		}
		if(StdDraw.isKeyPressed(68))
		{
			y -= 1;
		}
	}
	
}
