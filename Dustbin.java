import java.util.ArrayList;

public class Dustbin
{	
	private String color;
	private ArrayList<PaperGarbage> paperContent;
	private ArrayList<PlasticGarbage> plasticContent;
	private ArrayList<Garbage> houseWasteContent;	
	
	public Dustbin(String color)
	{
		this.color = color;
		this.paperContent = new ArrayList <PaperGarbage>();
		this.plasticContent = new ArrayList <PlasticGarbage>();
		this.houseWasteContent = new ArrayList <Garbage>();
		
	}
	
	public void throwOutGarbage(Garbage garbage) throws DustbinContentException
	{
		if(garbage instanceof PaperGarbage) 
		{
			PaperGarbage paperGarbage = (PaperGarbage)garbage;
			if(paperGarbage.isSqueezed())
			{
				this.paperContent.add(paperGarbage);
			}
			else
			{
				throw new DustbinContentException("Clean, before you throw it out!");
			}
		}
		else if(garbage instanceof PlasticGarbage)
		{
			PlasticGarbage plasticGarbage = (PlasticGarbage)garbage;
			if(plasticGarbage.isClean())
			{
				this.plasticContent.add(plasticGarbage);
			}
			else
			{
				throw new DustbinContentException("Clean, before you throw it out!");
			}
		}
		else if(garbage instanceof Garbage)
		{
			this.houseWasteContent.add(garbage);
		}
		else
		{
			throw new DustbinContentException("Clean, before you throw it out!");
		}
	}

	public void emptyContents()
	{
		this.paperContent = new ArrayList <PaperGarbage>();
		this.plasticContent = new ArrayList <PlasticGarbage>();
		this.houseWasteContent = new ArrayList <Garbage>();
	}
	
	public PaperGarbage[] getPaperContent()
	{
		return (PaperGarbage[]) paperContent.toArray();
	}

	public PlasticGarbage[] getPlasticContent()
	{
		return (PlasticGarbage[]) plasticContent.toArray();
	}

	public Garbage[] getHouseWasteContent()
	{
		return (Garbage[]) houseWasteContent.toArray();
	}

}



