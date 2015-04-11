package fr.iutvalence.info.m2103.battleship;
/**
 * The player class  
 * @author Medy and Jean-Baptiste
 *
 */
public class Player
{
	/**
	 * The default number of ship
	 */
	private static final int NB_DEFAULT_SHIP = 5;
	
	/**
	 * The board of the player
	 */
	private final BattleShipBoard playerBoard;
	
	/**
	 * The board of the ennemy
	 */
	private final BattleShipBoard ennemyBoard;
	
	/**
	 * The number of ship
	 */
	private final int nbShip;

	/**
	 * The name of the player
	 */
	private String name;
	
	
	/**
	 * the player constructor
	 */
	public Player()
	{
		this.playerBoard = new BattleShipBoard();
		this.ennemyBoard = new BattleShipBoard();
		this.nbShip = NB_DEFAULT_SHIP;
	}
	
	/**
	 * This method allows to get the name of the player 
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * This method allows to set the name of the player
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}
	
}
