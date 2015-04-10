package fr.iutvalence.info.m2103.battleship;

/**
 * the destroyer class
 * @author khebibem
 *
 */
public class Destroyer extends Ship
{

	/**
	 * The default number of square occuped by the destroyer
	 */
	public final static int NB_DESTROYER_SQUARE_OCCUPED=2;
	
	/**
	 * the destroyer constructor
	 */
	public Destroyer()
	{
		this.nbOccupedSquare = NB_DESTROYER_SQUARE_OCCUPED;
		this.name="Destroyer";
	}
}
