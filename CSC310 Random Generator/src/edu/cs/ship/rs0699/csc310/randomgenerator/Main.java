package edu.cs.ship.rs0699.csc310.randomgenerator;

public class Main {

  public static void main(String[] args) {
    String smallFile = "SmallSamples/SmallSample";
    String mediumFile = "MediumSamples/MediumSample";
    String largeFile = "LargeSamples/LargeSample";
    NumberGenerator numGen = new NumberGenerator();

    System.out.println("Generating small sample files");
    for(int i = 1; i < 31; i++) {
      FileHandler fh = new FileHandler(smallFile + i + ".txt");
      fh.putDataInFile(numGen.generateStringList(10000));
      System.out.println("Generated "+ i + "/30 files");
    }
    
    System.out.println("Generating medium files");
    for(int i = 1; i < 31; i++) {
      FileHandler fh = new FileHandler(mediumFile + i + ".txt");
      fh.putDataInFile(numGen.generateStringList(100000));
      System.out.println("Generated "+ i + "/30 files");
    }
    
    System.out.println("Generating large files");
    for(int i = 1; i < 31; i++) {
      FileHandler fh = new FileHandler(largeFile + i + ".txt");
      fh.putDataInFile(numGen.generateStringList(1000000));
      System.out.println("Generated "+ i + "/30 files");
    }
    
  }
  
}
