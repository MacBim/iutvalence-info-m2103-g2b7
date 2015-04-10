package fr.iutvalence.info.m2103.battleship;

public class Destroyer extends Ship
{

	public final static int NB_DESTROYER_SQUARE_OCCUPED=2;
	
	public Destroyer()
	{
		this.nbOccupedSquare = NB_DESTROYER_SQUARE_OCCUPED;
		this.name="Destroyer";
	}
}
