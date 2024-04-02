package model;

public class ReservationRestaurant extends Reservation {
    private int numeroService;
    private int numeroTable;

    public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
        super(jour, mois);
        this.numeroService = numeroService;
        this.numeroTable = numeroTable;
    }

    @Override
    public String toString() {
        return String.format("Le %d/%d : Table %d pour le %s service.",
                jour, mois, numeroTable, numeroService == 1 ? "premier" : "deuxième");
    }
}

