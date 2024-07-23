package fr.diginamic.builder;

import fr.diginamic.factory.Additif;
import fr.diginamic.factory.Allergene;
import fr.diginamic.factory.Ingredient;

import java.util.List;

public class ProduitBuilder {
    private Produit produit;

    public ProduitBuilder() {
        produit = new Produit();
    }

    public ProduitBuilder appendNom(String nom) {
        produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade) {
        produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendAdditifs(List<Additif> additifs) {
        produit.setAdditifs(additifs);
        return this;
    }

    public ProduitBuilder appendAllergenes(List<Allergene> allergenes) {
        produit.setAllergenes(allergenes);
        return this;
    }

    public ProduitBuilder appendIngredients(List<Ingredient> ingridients) {
        produit.setIngredients(ingridients);
        return this;
    }

    public ProduitBuilder appendMarque(Marque marque) {
        produit.setMarque(marque);
        return this;
    }

    public ProduitBuilder appendCategorie(Categorie categorie) {
        produit.setCategorie(categorie);
        return this;
    }

    public Produit build() {
        return produit;
    }

}
