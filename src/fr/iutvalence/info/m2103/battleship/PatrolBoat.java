package fr.iutvalence.info.m2103.battleship;
/**
 * The patrolboat class
 * @author khebibem
 *
 */
public class PatrolBoat extends Ship
{

	/**
	 * The default number of square occuped by the patrolboat
	 */
	public final static int NB_PATROLBOAT_SQUARE_OCCUPED=3;
	
	/**
	 * the patrolboat constructor
	 */
	public PatrolBoat()
	{
		this.nbOccupedSquare = NB_PATROLBOAT_SQUARE_OCCUPED;
		this.name="Patrolboat";
	}
}
