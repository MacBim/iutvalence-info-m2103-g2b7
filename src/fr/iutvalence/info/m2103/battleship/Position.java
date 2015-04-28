package fr.iutvalence.info.m2103.battleship;

public class Position
{

	private int abscissa;
	private int ordinate;

	public Position() 
	{
		this.abscissa = 0;
		this.ordinate = 0;
	}
	
	public Position(int x, int y) 
	{
		this.abscissa = x;
		this.ordinate = y;
	}

	public int getAbscissa() 
	{
		return abscissa;
	}


	public int getOrdinate() 
	{
		return ordinate;
	}
	
	public void setAbscissa(int x) 
	{
		this.abscissa = x;
	}

	public void setOrdinate(int y) 
	{
		this.ordinate = y;
	}
	
	public void setPosition(int x, int y) 
	{
		this.abscissa = x;
		this.ordinate = y;
	}

}