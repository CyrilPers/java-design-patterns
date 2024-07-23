package fr.diginamic.composite;

import org.junit.Test;

import java.util.List;

public class CompositeTest {
    @Test
    public void calculateSalaire() {
        Service primaryService = new Service("PrimaryService");
        Service secondaryService = new Service("SecondaryService");
        Service tertiaryService = new Service("TertiaryService");
        primaryService.addElement(secondaryService);
        secondaryService.addElement(tertiaryService);
        Employe employe1 = new Employe("John", "Doe", 1000);
        Employe employe2 = new Employe("Sara", "Miller", 1000);
        Employe employe3 = new Employe("Andrew", "Brown", 1000);
        Employe employe4 = new Employe("Robert", "Davis", 1000);
        Employe employe5 = new Employe("Mc", "Gregor", 10000);
        primaryService.addElement(employe1);
        primaryService.addElement(employe2);
        secondaryService.addElement(employe3);
        secondaryService.addElement(employe4);
        tertiaryService.addElement(employe5);

        assert(primaryService.calculerSalaire() == 14000);
        assert(secondaryService.calculerSalaire() == 12000);
        assert(tertiaryService.calculerSalaire() == 10000);
        assert(employe1.calculerSalaire() == 1000);
    }
}
