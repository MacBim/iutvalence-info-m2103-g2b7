package fr.iutvalence.info.m2103.battleship;

public class Position
{

	private int abscisse;
	private int ordonnee;

	public Position() 
	{
		this.abscisse = 0;
		this.ordonnee = 0;
	}


	public Position(int x, int y) 
	{
		this.abscisse = x;
		this.ordonnee = y;
	}

	public int getAbscisse() 
	{
		return abscisse;
	}


	public int getOrdonnee() 
	{
		return ordonnee;
	}
	
	public void setAbscisse(int x) 
	{
		this.abscisse = x;
	}

	public void setOrdonnee(int y) 
	{
		this.ordonnee = y;
	}
	
	public void setPosition(int x, int y) 
	{
		this.abscisse = x;
		this.ordonnee = y;
	}

}