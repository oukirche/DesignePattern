package org.oukirche.strategy;

public class DocxExtension implements SaveFile{
    @Override
    public void saveFile() {
        System.out.println("Save file as a Docx extension");
    }
}
