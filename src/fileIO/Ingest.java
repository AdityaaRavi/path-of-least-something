package fileIO;

import java.util.Scanner;
import java.io.File;

public abstract class Ingest {
    //fields
    String fileName;
    File fileHandler;
    Scanner fileScanner;

    public Ingest(){
        this.fileName = "input1.txt";
        fileHandler = new File(fileName);
    }

    public Ingest(String fileName){
        this.fileName = fileName;
        fileHandler = new File(fileName);
    }

    public abstract char[][] getBoard();
}