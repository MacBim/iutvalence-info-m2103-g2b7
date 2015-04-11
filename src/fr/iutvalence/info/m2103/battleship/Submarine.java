package fr.iutvalence.info.m2103.battleship;

/**
 * The submarine class
 * @author khebibem
 *
 */
public class Submarine extends Ship
{
	/**
	 * The length of the submarine
	 */
	public final static int SUBMARINE_LENGTH=3;
	
	/**
	 * the submarine constructor
	 */
	public Submarine()
	{
		super(getPosition(),SUBMARINE_LENGTH,"Submarine");
	}

}
