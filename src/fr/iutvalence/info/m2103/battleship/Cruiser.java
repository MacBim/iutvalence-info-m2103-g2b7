package fr.iutvalence.info.m2103.battleship;

/**
 * The Cruiser class
 * @author khebibem
 *
 */
public class Cruiser extends Ship
{
	/**
	 * The length of the cruiser
	 */
	public final static int CRUISER_LENGTH=4;
	
	/**
	 * The cruiser constructor
	 */
	public Cruiser(Position pos)
	{
		super(pos,CRUISER_LENGTH,"Cruiser");
	}

}
