package Cellule;

public class CelluleEtatMort implements CelluleEtat {

  static CelluleEtatMort instance;
  private CelluleEtatMort() {}
  /**
   * Singleton
   *
   * @return un singleton CelluleEtatMort
   * */
  public static CelluleEtatMort getInstance() {
    if (instance == null) {
      instance = new CelluleEtatMort();
    }
    return instance;
  }
  /***
   *
   * @return retourne une cellule vivante.
   */
  public CelluleEtat vit() {
    return new CelluleEtatVivant();
  }

  public CelluleEtat meurt() {
    return this;
  }

  public boolean estVivant() {
    return false;
  }
}
