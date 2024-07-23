package fr.diginamic.factory;

public interface IFactory {
    Element createElement(Type type, String nom, double valeur, UNITE unite);
}
