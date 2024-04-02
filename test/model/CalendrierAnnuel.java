package model;

public class CalendrierAnnuel {
    private boolean[] jours; // Tableau pour marquer les jours réservés dans l'année

    public CalendrierAnnuel() {
        // Initialiser l'année avec 365 jours
        this.jours = new boolean[365]; // Non-bissextile par défaut
    }

    // Méthode pour calculer l'index du jour dans l'année
    private int calculerIndex(int jour, int mois) {
        int[] joursParMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int index = jour - 1; // Jours sont en base 1, donc soustraction nécessaire

        for (int i = 0; i < mois - 1; i++) { // Mois en base 1, donc -1
            index += joursParMois[i];
        }

        return index;
    }

    // Vérifie si un jour spécifique est libre
    public boolean estLibre(int jour, int mois) {
        int index = calculerIndex(jour, mois);
        return !jours[index];
    }

    // Tente de réserver un jour spécifique
    public boolean reserver(int jour, int mois) {
        if (estLibre(jour, mois)) {
            jours[calculerIndex(jour, mois)] = true;
            return true; // Réservation réussie
        }
        return false; // Jour déjà réservé
    }
}
