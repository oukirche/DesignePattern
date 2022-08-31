package org.oukirche.adapter;

public class AgenceAdapter implements Bank{

    private Agence agence;

    @Override
    public void retirerArgent(double montant) {
        agence = new Agence();
        agence.verificatonDeCheck();
        agence.retirerArgent(montant);
    }
}
