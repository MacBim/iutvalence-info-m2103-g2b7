package fr.iutvalence.info.m2103.battleship;

public class Cruiser extends Ship
{
	public final static int NB_CRUISER_SQUARE_OCCUPED=4;
	
	public Cruiser()
	{
		this.nbOccupedSquare = NB_CRUISER_SQUARE_OCCUPED;
		this.name="Cruiser";
	}

}
