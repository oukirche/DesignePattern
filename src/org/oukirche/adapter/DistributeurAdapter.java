package org.oukirche.adapter;

public class DistributeurAdapter implements Bank{

    DistributeurBillets distributeurBillets;
    @Override
    public void retirerArgent(double montant) {
        distributeurBillets = new DistributeurBillets();
        distributeurBillets.verificationCartBancaire();
        distributeurBillets.retirerArgent(montant);
    }
}
