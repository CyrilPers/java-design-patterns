package fr.diginamic.builder;

import fr.diginamic.factory.Additif;
import fr.diginamic.factory.Allergene;
import fr.diginamic.factory.Ingredient;

import java.util.List;

public class Produit {
    private String nom;
    private String grade;

    private List<Additif> additifs;
    private List<Allergene> allergenes;
    private List<Ingredient> ingridients;
    private Marque marque;
    private Categorie categorie;

    protected Produit() {
    }

    protected String getNom() {
        return nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected String getGrade() {
        return grade;
    }

    protected void setGrade(String grade) {
        this.grade = grade;
    }

    protected List<Additif> getAdditifs() {
        return additifs;
    }

    protected void setAdditifs(List<Additif> additifs) {
        this.additifs = additifs;
    }

    protected List<Allergene> getAllergenes() {
        return allergenes;
    }

    protected void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

    protected List<Ingredient> getIngridients() {
        return ingridients;
    }

    protected void setIngredients(List<Ingredient> ingridients) {
        this.ingridients = ingridients;
    }

    protected Marque getMarque() {
        return marque;
    }

    protected void setMarque(Marque marque) {
        this.marque = marque;
    }

    protected Categorie getCategorie() {
        return categorie;
    }

    protected void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
