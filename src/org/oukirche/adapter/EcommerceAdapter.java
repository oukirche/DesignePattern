package org.oukirche.adapter;

public class EcommerceAdapter implements Bank{

    EcommerceSite ecommerceSite;
    @Override
    public void retirerArgent(double montant) {
        ecommerceSite = new EcommerceSite();
        ecommerceSite.verificationInfo();
        ecommerceSite.retirerArgent(montant);
    }
}
