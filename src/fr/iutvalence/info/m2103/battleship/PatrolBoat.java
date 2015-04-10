package fr.iutvalence.info.m2103.battleship;

public class PatrolBoat extends Ship
{

	public final static int NB_PATROL_BOAT_SQUARE_OCCUPED=3;
	
	public PatrolBoat()
	{
		this.nbOccupedSquare = NB_PATROL_BOAT_SQUARE_OCCUPED;
		this.name="Patrol Boat";
	}
}
