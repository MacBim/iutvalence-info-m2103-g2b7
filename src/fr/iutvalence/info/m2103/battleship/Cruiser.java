package fr.iutvalence.info.m2103.battleship;

/**
 * The Cruiser class
 * @author khebibem
 *
 */
public class Cruiser extends Ship
{
	/**
	 * The default number of square occuped by the cruiser
	 */
	public final static int NB_CRUISER_SQUARE_OCCUPED=4;
	
	/**
	 * The cruiser constructor
	 */
	public Cruiser()
	{
		this.nbOccupedSquare = NB_CRUISER_SQUARE_OCCUPED;
		this.name="Cruiser";
	}

}
