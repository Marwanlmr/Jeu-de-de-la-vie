package Cellule;

public class Cellule implements CelluleEtat{
  CelluleEtat etat;

  public Cellule(){
    this.etat = CelluleEtatMort.getInstance();
  }
  @Override
  public CelluleEtat vit() {
    this.etat = CelluleEtatVivant.getInstance();
    return this.etat;
  }

  @Override
  public CelluleEtat meurt() {
    return this.etat = CelluleEtatMort.getInstance();
  }

  @Override
  public boolean estVivant() {
    return this.etat.estVivant();
  }
}
