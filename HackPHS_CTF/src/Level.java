public class Level
{
	private final int LENGTH;
	private final int WIDTH;
	private String background;
	private Entity[] entities;
			
	public Level(int l, int w, String b)
	{
		LENGTH = l;
		WIDTH = w;
		background = b;
		StdDraw.setCanvasSize(LENGTH, WIDTH);
	}
	
	public void render()
	{
		StdDraw.picture(0, 0, background);
		for(int i = 0; i < entities.length; i++)
		{
			entities[i].draw();
		}
		StdDraw.show();
	}
	
	public void move(Entity e, Vector v)
	{
		
	}
	}
}