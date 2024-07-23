package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
    private String nom;
    private List<IElement> elements;

    public Service(String nom) {
        this.nom = nom;
    }

    public Service() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<IElement> getElements() {
        return elements;
    }

    public void setElements(List<IElement> elements) {
        this.elements = elements;
    }

    public void addElement(IElement element) {
        if (elements == null)
            elements = new ArrayList<>();
        elements.add(element);
    }

    @Override
    public double calculerSalaire() {
        double salaire = 0;
        for (IElement element : elements)
            salaire += element.calculerSalaire();
        return salaire;
    }
}
