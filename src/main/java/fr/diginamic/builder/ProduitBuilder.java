package fr.diginamic.builder;

import fr.diginamic.factory.Additif;
import fr.diginamic.factory.Allergene;
import fr.diginamic.factory.Ingredient;

import java.util.ArrayList;
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

    public ProduitBuilder appendAdditif(Additif additif) {
        List<Additif> additifs = produit.getAdditifs();
        if (additifs == null) {
            additifs = new ArrayList<>();
        }
        additifs.add(additif);
        produit.setAdditifs(additifs);
        return this;
    }


    public ProduitBuilder appendAllergenes(List<Allergene> allergenes) {
        produit.setAllergenes(allergenes);
        return this;
    }

    public ProduitBuilder appendAllergene(Allergene allergene) {
        List<Allergene> allergenes = produit.getAllergenes();
        if (allergenes == null) {
            allergenes = new ArrayList<>();
        }
        allergenes.add(allergene);
        produit.setAllergenes(allergenes);
        return this;
    }

    public ProduitBuilder appendIngredients(List<Ingredient> ingridients) {
        produit.setIngredients(ingridients);
        return this;
    }

    public ProduitBuilder appendIngredient(Ingredient ingredient) {
        List<Ingredient> ingredients = produit.getIngridients();
        if (ingredients == null) {
            ingredients = new ArrayList<>();
        }
        ingredients.add(ingredient);
        produit.setIngredients(ingredients);
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
