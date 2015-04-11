package fr.iutvalence.info.m2103.battleship;

/**
 * the destroyer class
 * @author khebibem
 *
 */
public class Destroyer extends Ship
{

	/**
	 * The length of the destroyer
	 */
	public final static int DESTROYER_LENGTH=2;
	
	/**
	 * the destroyer constructor
	 */
	public Destroyer()
	{
		super(getPosition(),DESTROYER_LENGTH,"Destroyer");
	}
}
