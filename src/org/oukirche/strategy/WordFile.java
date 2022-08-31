package org.oukirche.strategy;

public class WordFile {

    SaveFile saveFile;

    public SaveFile getSaveFile() {
        return saveFile;
    }

    public void setSaveFile(SaveFile saveFile) {
        this.saveFile = saveFile;
    }

    public void saveFile(){
        saveFile.saveFile();
    }
}
