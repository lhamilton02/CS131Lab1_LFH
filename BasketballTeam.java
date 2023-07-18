
import java.util.Arrays;

class BasketballTeam extends SportsTeam 
{
    private int fieldGoals = 0;
    private int fieldGoalsAttempted;
    private int freeThrows;
    private int freeThrowsAttempted;

    public BasketballTeam() 
    {
        super();
        fieldGoals = 0;
        fieldGoalsAttempted = 0;
        freeThrows = 0;
        freeThrowsAttempted = 0;
    }//empty argument constructor

    public BasketballTeam(String teamName, String teamMascot, String headCoach, int fieldGoals)
    {
    	super(teamName, teamMascot, headCoach, 0, 0);
        this.fieldGoals = fieldGoals;
        this.fieldGoalsAttempted = fieldGoalsAttempted;
        this.freeThrows = freeThrows;
        this.freeThrowsAttempted = freeThrowsAttempted;
    }

    public double fieldGoalPercentage() 
    {
        return (double) fieldGoals / fieldGoalsAttempted;
    }

    public double freeThrowPercentage()
    {
        return (double) freeThrows / freeThrowsAttempted;
    }

    @Override
    public double[] getStats() 
    {
        double[] stats = new double[3];
        
        stats[0] = getWinPercentage();
        stats[1] = fieldGoalPercentage();
        stats[2] = freeThrowPercentage();
        return stats;
    }

	@Override
	public String toString() 
	{
		return "BasketballTeam [getStats()=" + Arrays.toString(getStats()) + "]";
	}
    
    
    }//end class