package fr.diginamic.composite;

import java.util.List;

public class Service implements IElement {
    private String nom;
    private List<Employe> employes;
    private List<Service> services;

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

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @Override
    public double calculerSalaire() {
        double salaire = 0;
        for (Employe employe : employes)
            salaire += employe.calculerSalaire();
        if (services != null) {
        for (Service service : services)
            salaire += service.calculerSalaire();
        }
        return salaire;
    }
}
