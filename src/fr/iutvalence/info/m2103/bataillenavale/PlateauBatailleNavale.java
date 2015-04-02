package fr.iutvalence.info.m2103.bataillenavale;
/**
 * La classe PlateauBatailleNavale
 * @author Medy et Jean-Baptiste
 *
 */
public class PlateauBatailleNavale
{
	public final static int NB_LIGNE_DEFAUT=11;
	public final static int NB_COLONNE_DEFAUT=11;
	
	private CasePlateau[][] plateauJoueur;
	
	
	/**
	 * Constructeur du plateau de 11 lignes/colonnes
	 */
	public PlateauBatailleNavale()
	{
		this.plateauJoueur= new CasePlateau[NB_LIGNE_DEFAUT][NB_COLONNE_DEFAUT];
	}
}
