package org.oukirche.strategy;

public class PdfExtension implements SaveFile{
    @Override
    public void saveFile() {
        System.out.println("Save file as pdf extension");
    }
}
