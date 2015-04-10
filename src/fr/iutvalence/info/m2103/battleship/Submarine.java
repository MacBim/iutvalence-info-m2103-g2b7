package fr.iutvalence.info.m2103.battleship;

public class Submarine extends Ship
{
	public final static int NB_SUBMARINE_SQUARE_OCCUPED=3;
	
	public Submarine()
	{
		this.nbOccupedSquare = NB_SUBMARINE_SQUARE_OCCUPED;
		this.name="Submarine";
	}

}
