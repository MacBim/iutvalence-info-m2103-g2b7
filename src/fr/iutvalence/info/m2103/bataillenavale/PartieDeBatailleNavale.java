package fr.iutvalence.info.m2103.bataillenavale;

/**
 * Une partie de Bataille Navale
 * @author Medy et Jean-Baptiste
 *
 */
public class PartieDeBatailleNavale
{
	private final Joueur joueur1;
	private final Joueur joueur2;
	private final boolean tour;
		
	
	/** 
	 * Constructeur de la partie
	 */
	public PartieDeBatailleNavale()
	{
		this.joueur1 = new Joueur();
		this.joueur2 = new Joueur();
		this.tour = true;
	}

	public void jouer()
	{
		
	}
}
