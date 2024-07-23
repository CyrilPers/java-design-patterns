package fr.diginamic.composite;

import org.junit.Test;

import java.util.List;

public class CompositeTest {
    @Test
    public void calculateSalaire() {
        Service primaryService = new Service("PrimaryService");
        Service secondaryService = new Service("SecondaryService");
        primaryService.setServices(List.of(secondaryService));
        Employe employe1 = new Employe("John", "Doe", 1000);
        Employe employe2 = new Employe("Sara", "Miller", 1000);
        Employe employe3 = new Employe("Andrew", "Brown", 1000);
        Employe employe4 = new Employe("Robert", "Davis", 1000);
        primaryService.setEmployes(List.of(employe1, employe2));
        secondaryService.setEmployes(List.of(employe3, employe4));

        assert(primaryService.calculerSalaire() == 4000);
        assert(secondaryService.calculerSalaire() == 2000);
        assert(employe1.calculerSalaire() == 1000);
    }
}
