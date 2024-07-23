package fr.diginamic.factory;

public abstract class Element {
    protected String nom;
    protected double valeur;
    protected UNITE unite;

    public Element(String nom, double valeur, UNITE unite) {
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public UNITE getUnite() {
        return unite;
    }

    public void setUnite(UNITE unites) {
        this.unite = unites;
    }
}
