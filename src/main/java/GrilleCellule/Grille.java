package GrilleCellule;
import Cellule.Cellule;
public class Grille {

  Cellule[][] grille;
  public int x;
  public int y;

  public Grille(int hauteur, int largeur) {
    grille = new Cellule[hauteur][largeur];
    x = hauteur;
    y = largeur;
  }

  public Cellule[][] getTab(){
    return grille;
  }


}