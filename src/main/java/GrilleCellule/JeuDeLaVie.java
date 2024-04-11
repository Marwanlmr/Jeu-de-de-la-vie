package GrilleCellule;
import Cellule.Cellule;
public class JeuDeLaVie {
  public Grille grille;

  public JeuDeLaVie(int x, int y) {
    initaliseGrille(x, y);
  }
  void initaliseGrille(int x, int y) {
    this.grille = new Grille(x, y);
    for (int i = 0; i < grille.x; i++) {
      for (int j = 0; j < grille.y; j++) {
        grille.grille[i][j] = new Cellule();
        if(Math.random() < 0.5) {
          grille.grille[i][j].vit();
        }
        else {
          grille.grille[i][j].meurt();
        }
      }
    }
  }

  public Grille getGrille() {
    return grille;
  }

  public void afficheGrille() {
    for (int i = 0; i < grille.x; i++) {
      for (int j = 0; j < grille.y; j++) {
        if(grille.grille[i][j].estVivant()) {
          System.out.print("X");
        }
        else {
          System.out.print(".");
        }
      }
      System.out.println();
    }
  }
}
