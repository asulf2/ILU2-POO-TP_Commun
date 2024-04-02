package model;

public abstract class Reservation {
    protected int jour;
    protected int mois;

    public Reservation(int jour, int mois) {
        this.jour = jour;
        this.mois = mois;
    }

    // Cette méthode sera redéfinie dans les sous-classes pour afficher les détails spécifiques de chaque type de réservation
    @Override
    public abstract String toString();
}

