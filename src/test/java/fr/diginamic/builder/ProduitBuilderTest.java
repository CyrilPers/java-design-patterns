package fr.diginamic.builder;

import fr.diginamic.factory.Additif;
import fr.diginamic.factory.Allergene;
import fr.diginamic.factory.Ingredient;
import fr.diginamic.factory.UNITE;
import org.junit.Test;

import java.util.List;

public class ProduitBuilderTest {
    @Test
    public void createProduitWithProduitBuilder() {
        Ingredient ingredient = new Ingredient("Ingredient1",1, UNITE.MICRO_GRAMMES);
        Allergene allergene = new Allergene("Allergene1",2, UNITE.MILLI_GRAMMES);
        Additif additif = new Additif("Additif1",3, UNITE.MILLI_GRAMMES);

        Produit produit = new ProduitBuilder()
                .appendNom("ProductName")
                .appendGrade("Grade")
                .appendIngredients(List.of(ingredient))
                .appendAdditifs(List.of(additif))
                .appendAllergenes(List.of(allergene))
                .appendMarque(new Marque("Marque"))
                .appendCategorie(new Categorie("Categorie"))
                .build();

        assert(produit != null);
        assert(produit instanceof Produit);
        assert(produit.getNom().equals("ProductName"));
        assert(produit.getGrade().equals("Grade"));
        assert(produit.getIngridients().size() == 1);
        assert(produit.getIngridients().get(0).getNom().equals("Ingredient1"));
        assert(produit.getAdditifs().size() == 1);
        assert(produit.getAdditifs().get(0).getNom().equals("Additif1"));
        assert(produit.getAllergenes().size() == 1);
        assert(produit.getAllergenes().get(0).getNom().equals("Allergene1"));
        assert(produit.getMarque().getNom().equals("Marque"));
        assert(produit.getCategorie().getNom().equals("Categorie"));
        assert(produit.getIngridients().get(0).equals(ingredient));
    }

}
