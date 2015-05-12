package fr.iutvalence.info.m2103.battleship;

/**
 * The Battleship game
 * @author Medy and Jean-Baptiste
 *
 */
public class BattleShipGame
{

	/**
	 * Method who start a game
	 */
	public void play()
	{
		Player Player1 = new Player("Max");
		Player Player2 = new Player("Ennemy");
		
		
		Player1.playerBoard.setAShip(ShipType.AIRCRAFT_CARRIER, 4, 4, true);
		Player1.playerBoard.setAShip(ShipType.submarine, 1, 1, true);
		Player1.playerBoard.setAShip(ShipType.destroyer, 5, 5, true);
		Player1.playerBoard.setAShip(ShipType.cruiser, 1, 2, false);
		Player1.playerBoard.displayBoard();
		
	}
}
