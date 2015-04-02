package fr.iutvalence.info.m2103.bataillenavale;
/**
 * La classe Joueur
 * @author Medy et Jean-Baptiste
 *
 */
public class Joueur
{
	private static final int NB_BATEAUX_DEFAUT = 5;
	private final PlateauBatailleNavale plateauJoueur;
	private final PlateauBatailleNavale plateauAdversaire;
	private final int nbBateaux;
	
	
	/**
	 * Constructeur de Joueur
	 */
	public Joueur()
	{
		this.plateauJoueur = new PlateauBatailleNavale();
		this.plateauAdversaire = new PlateauBatailleNavale();
		this.nbBateaux = NB_BATEAUX_DEFAUT;
	}
	
}
