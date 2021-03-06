import java.util.ArrayList;

public class Level
{
	private ArrayList<Entity> entities = new ArrayList<Entity>();
			
	public Level(int l, int w, String b)
	{
		Entity ground = new Entity(b, l, w, 0, 0);
		entities.add(ground);
		StdDraw.setCanvasSize(l, w);
	}
	
	@SuppressWarnings("deprecation")
	public void render()
	{
		for(int i = 0; i < entities.size(); i++)
		{
			entities.get(i).draw();
		}
		StdDraw.show(20);
	}
	
	public void move(Entity e, Vector v)
	{
		
	}
	
	public void addEntity(Entity e)
	{
		entities.add(e);
	}
}