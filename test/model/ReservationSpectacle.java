package model;

public class ReservationSpectacle extends Reservation {
    private int numeroZone;
    private int numeroChaise;

    public ReservationSpectacle(int jour, int mois, int numeroZone, int numeroChaise) {
        super(jour, mois);
        this.numeroZone = numeroZone;
        this.numeroChaise = numeroChaise;
    }

    @Override
    public String toString() {
        return String.format("Le %d/%d : place n°%d dans la zone %d.",
                jour, mois, numeroChaise, numeroZone);
    }
}

