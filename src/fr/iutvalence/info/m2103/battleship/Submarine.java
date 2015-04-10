package fr.iutvalence.info.m2103.battleship;

/**
 * The submarine class
 * @author khebibem
 *
 */
public class Submarine extends Ship
{
	/**
	 * The default number of square occuped by the submarine
	 */
	public final static int NB_SUBMARINE_SQUARE_OCCUPED=3;
	
	/**
	 * the submarine constructor
	 */
	public Submarine()
	{
		this.nbOccupedSquare = NB_SUBMARINE_SQUARE_OCCUPED;
		this.name="Submarine";
	}

}
