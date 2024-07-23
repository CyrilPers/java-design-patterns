package fr.diginamic.factory;

import org.junit.Test;


public class FactoryTest {
    @Test
    public void testCreateElementIngredient() {
        Factory factory = new Factory();
        Element element = factory.createElement(Type.INGREDIENT, "ingredient1", 1.0, UNITE.MILLI_GRAMMES);
        assert(element instanceof Ingredient);
        assert(element.getNom().equals("ingredient1"));
        assert(element.getValeur() == 1.0);
        assert(element.getUnite() == UNITE.MILLI_GRAMMES);
    }

    @Test
    public void testCreateElementAllergene() {
        Factory factory = new Factory();
        Element element = factory.createElement(Type.ALLERGENE, "allergene1", 2.0, UNITE.MICRO_GRAMMES);
        assert(element instanceof Allergene);
        assert(element.getNom().equals("allergene1"));
        assert(element.getValeur() == 2.0);
        assert(element.getUnite() == UNITE.MICRO_GRAMMES);
    }
    @Test
    public void testCreateElementAdditif() {
        Factory factory = new Factory();
        Element element = factory.createElement(Type.ADDITIF, "additif1", 3.0, UNITE.MICRO_GRAMMES);
        assert(element instanceof Additif);
        assert(element.getNom().equals("additif1"));
        assert(element.getValeur() == 3.0);
        assert(element.getUnite() == UNITE.MICRO_GRAMMES);
    }
}
