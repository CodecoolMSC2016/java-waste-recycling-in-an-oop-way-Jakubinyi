public class PaperGarbage extends Garbage 
{	
	public boolean isSqueezed;

	public PaperGarbage(String name, boolean isSqueezed)
	{
		super(name);
		this.isSqueezed = isSqueezed;	
	}
	
	public void squeeze()
	{
		this.isSqueezed = true;
	}

	public boolean isSqueezed()
	{
		return this.isSqueezed;
	}
}
