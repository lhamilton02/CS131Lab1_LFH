import java.util.Random;

public class GameCharacter {

	protected String uniqueID, personality;
	
	
	public GameCharacter()
	{
		Random r = new Random();
		r.setSeed(100);
		int id = r.nextInt(1000);
		setUniqueID(Integer.toString(id));
		setPersonality("NEUTRAL");
		
	}//end empty argument constructor
	
	public GameCharacter(String Uniqueid, String personality)
	{
		setUniqueID(uniqueID);
		setPersonality(personality);
			
	}//end preferred argument constructor

	
	public String reportStructure()
	{
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("	UniqueID: "+getUniqueID()+"\n");
		sb.append("	Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
		
	}//end reportStats
	
	
	
	
	
	public String getUniqueID()
	{
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) 
	{
		this.uniqueID = uniqueID;
	}

	public String getPersonality() 
	{
		return personality;
	}

	public void setPersonality(String personality)
	{
		this.personality = personality;
	}

	@Override
	public String toString() 
	{
		return "GameCharacter [uniqueID=" + uniqueID + ", personality=" + personality + "]";
	}//end to string method
	
	
	
	
	
	
}//end class
