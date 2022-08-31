package org.oukirche.strategy;

public class Client {

    void exp(){
        WordFile wordFile = new WordFile();
        wordFile.setSaveFile(new DocExtension());
        wordFile.saveFile();
        System.out.println("---------------------------------------------------------");
        wordFile.setSaveFile(new DocxExtension());
        wordFile.saveFile();
        System.out.println("----------------------------------------------------------");
        wordFile.setSaveFile(new PdfExtension());
        wordFile.saveFile();
    }
    public Client() {
        exp();
    }

    public static void main(String[] args) {
        new Client();
    }
}
