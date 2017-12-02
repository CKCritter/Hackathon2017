
public class Player extends Entity {
	
	protected int health = 100;
	protected Vector vec;
	
	public Player (String im, double l, double w, double x, double y, Vector v) {
		super(im,  l,  w,  x,  y);
		
		vec = v;
	}
	
	
	
}
