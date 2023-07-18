

abstract class SportsTeam 
{
   
	protected String teamName;
	protected String teamMascot;
    protected String headCoach;
    protected int wins;
    protected int losses;

    
    
    public SportsTeam() 
    {
        teamName = "";
        teamMascot = "";
        headCoach = "";
        wins = 0;
        losses = 0;
    }//empty-argument constructor

    public SportsTeam(String teamName, String teamMascot, String coachName, int wins, int losses)
    {
        this.teamName = teamName;
        this.teamMascot = teamMascot;
        this.headCoach = coachName;
        this.wins = wins;
        this.losses = losses;
    } //preferred argument constructor
    
    
    
    public String getTeamName() 
    {
		return teamName;
	}

	public void setTeamName(String teamName) 
	{
		this.teamName = teamName;
	}

	public String getTeamMascot()
	{
		return teamMascot;
	}

	public void setTeamMascot(String teamMascot)
	{
		this.teamMascot = teamMascot;
	}

	public String getHeadCoach() 
	{
		return headCoach;
	}

	public void setHeadCoach(String headCoach)
	{
		this.headCoach = headCoach;
	}

	public int getWins()
	{
		return wins;
	}

	public void setWins(int wins) 
	{
		this.wins = wins;
	}

	public int getLosses()
	{
		return losses;
	}

	public void setLosses(int losses)
	{
		this.losses = losses;
	}

	public double getWinPercentage()
    {
    	return (double) wins/(wins+losses);
    }
        
    public abstract double[] getStats();
    //abstract so no implementation?
    
    
}//end class
