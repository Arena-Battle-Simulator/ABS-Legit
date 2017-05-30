//This is going to be the class file for all of the AI stuff
public class AIclass 
{
	/*php = player's health
	 * ahp = ai's health
	 * asp = ai's stamina
	 * pm = the most damage that has been done to the ai in a single turn
	 * stuffdone = returns what the ai does in its turn (the number assigned to the move that it does)
	 * md = damage values for the ai's moves
	 * ms = stamina values for the ai's moves
	 * moves = the numerical code for the ai's moves
	 */
	public int php, ahp, asp, pm, stuffdone;
	public int[] md, ms, moves;
	
	AIclass (int[] moves1, int[] md1, int[] ms1, int ahp1, int asp1)
	{
		ahp = ahp1;
		asp = asp1;
		md = new int[6];
		ms = new int[6];
		moves = new int[6];
		for (int a = 0;a < 6;a++)
		{
			md[a] = md1[a];
			ms[a] = ms1[a];
			moves[a] = moves1[a];
		}
	}

	public int mam (int php1, int pm1)
	{
		php = php1;
		if (pm1 > pm)
		{
			pm = pm1;
		}
		if (pm > ahp)
		{
			
		}
	}
	
}
