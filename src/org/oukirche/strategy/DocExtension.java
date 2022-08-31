package org.oukirche.strategy;

public class DocExtension implements SaveFile{
    @Override
    public void saveFile() {
        System.out.println("Save file as Doc extension");
    }
}
