public class PlasticGarbage extends Garbage
{	
	private boolean isClean;

	public PlasticGarbage(String name, boolean isClean)
	{
		super(name);
		this.isClean = isClean;	
	}
	
	public void clean()
	{
		this.isClean = true;
	}

	public boolean isClean()
	{
		return isClean;
	}
}

