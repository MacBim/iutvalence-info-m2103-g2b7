package fr.iutvalence.info.m2103.battleship;
/**
 * The patrolboat class
 * @author khebibem
 *
 */
public class PatrolBoat extends Ship
{

	/**
	 * The patrolboat length
	 */
	public final static int PATROL_BOAT_LENGTH=3;
	
	/**
	 * the patrolboat constructor
	 */
	public PatrolBoat(Position pos)
	{
		super(pos,PATROL_BOAT_LENGTH,"Patrolboat");
	}
}
