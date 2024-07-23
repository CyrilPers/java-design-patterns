package fr.diginamic.factory;

public class Factory implements IFactory {
    public Element createElement(Type type, String nom, double valeur, UNITE unite) {
        Element element = null;
        switch (type) {
            case INGREDIENT:
                element = new Ingredient(nom, valeur, unite);
                break;
            case ALLERGENE:
                element = new Allergene(nom, valeur, unite);
                break;
            case ADDITIF:
                element = new Additif(nom, valeur, unite);
                break;
        }
        return element;
        }
}
