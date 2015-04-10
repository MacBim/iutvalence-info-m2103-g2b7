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
	 * the board of the player
	 */
	private final BattleShipBoard playerBoard;
	
	/**
	 * the board of the ennemy
	 */
	private final BattleShipBoard ennemyBoard;
	
	/**
	 * the number of ship
	 */
	private final int nbShip;
	
	
	/**
	 * the player constructor
	 */
	public Player()
	{
		this.playerBoard = new BattleShipBoard();
		this.ennemyBoard = new BattleShipBoard();
		this.nbShip = NB_DEFAULT_SHIP;
	}
	
}
