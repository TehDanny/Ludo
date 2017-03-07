package LUDOSimulator;
import java.util.Random;
/**
 * My first AI player
 * @author Daniel Alexander Nedergaard
 * 
 */

public class ProbablyDumbLUDOPlayer implements LUDOPlayer
{
	LUDOBoard board;
	Random random;
	int depth = 4; // time constraint to avoid infinite loops
	
	public ProbablyDumbLUDOPlayer(LUDOBoard board)
	{
		this.board = board;
		random = new Random();
	}
	
	public void play()
	{
		board.print("Probably dumb player playing");
		
		int[] myBricksValue = new int[4];
		board.rollDice();
		float max =-1;
		int bestIndex =-1;
		for (int i = 0; i < myBricksValue.length; i++)
		{
			float value = analyseBrickPositions(i);
			if(value > max && value > 0)
			{
				bestIndex = i;
				max = value;
			}
		}
		if (bestIndex != -1)
			board.moveBrick(bestIndex);
	}
	
	private float analyseBrickPositions(int i)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void miniMax(LUDOBoard boardstate)
	{
	
	}
	
	public void min()
	{
		
	}
	
	public void max()
	{
		
	}
}
