package Cellule;

import GrilleCellule.JeuDeLaVie;

public class Cellule implements CelluleEtat{

  int x, y;
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

  int nombreVoisinesVivantes(JeuDeLaVie jeu) {
    int nb = 0;
    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
        if (i >= 0 && i < jeu.getGrille().x && j >= 0 && j < jeu.getGrille().y) {
          if (jeu.getGrille().getTab()[i][j].estVivant()) {
            nb++;
          }
        }
      }
    }
    if (this.estVivant()) {
      nb--;
    }
    return nb;
  }

}
