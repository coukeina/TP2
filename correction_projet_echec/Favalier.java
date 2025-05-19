import java.util.ArrayList;

class Favalier extends Piece{

    public Favalier(){
        super('B', new Position());
    }

    public Favalier(char couleur, Position position){
        super(couleur, position);
    }

    public String getType(){
        return new String("favalier");
    }

    public ArrayList<Position> getDeplacementPossible(Plateau pl)
    {
        // Le Favalier combine les déplacements du fou et du cavalier
        ArrayList<Position> retour = new ArrayList<Position>();

        Fou f = new Fou(this.getCouleur(), this.getPosition());
        Cavalier c = new Cavalier(this.getCouleur(), this.getPosition());

        ArrayList<Position> deplacementPossible = f.getDeplacementPossible(pl);
        for(Position p : deplacementPossible)
            retour.add(p);

        deplacementPossible = c.getDeplacementPossible(pl);
        for(Position p : deplacementPossible)
            retour.add(p);

        return retour;
    }
}
/*cyka*/