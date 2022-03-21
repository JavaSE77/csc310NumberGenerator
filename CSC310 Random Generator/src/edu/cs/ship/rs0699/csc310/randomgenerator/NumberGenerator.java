package edu.cs.ship.rs0699.csc310.randomgenerator;

import java.util.ArrayList;
import java.util.Random;

public class NumberGenerator {

  public NumberGenerator() {
    
  }
  
  /**
   * generateIntList() - generates a list of integers
   * @param int size - how large of an array to pass
   * @return arraylist of random integers
   * @deprecated this is not useful anymore
   * */
  public ArrayList<Integer> generateIntList(int size) {
    
    ArrayList<Integer> output = new ArrayList<Integer>();
    
    Random r = new Random(); 
    int max = 9999;
    
    for(int i = 0; i < size; i++) {
      int randomValue = r.nextInt(max); 
      output.add(randomValue);
    }
    
    return output;
  }
  
  /**
   * generateIntList() - generates a list of integers
   * @param int size - how large of an array to pass
   * @return arraylist of random integers, stored as strings
   * */
  public ArrayList<String> generateStringList(int size) {
    
    ArrayList<String> output = new ArrayList<String>();
    
    Random r = new Random(); 
    int max = 9999;
    
    for(int i = 0; i < size; i++) {
      int randomValue = r.nextInt(max); 
      output.add("" + randomValue);
    }
    
    return output;
  }
  
  /**
   * fillFile() - fills a file of random values.
   * @param int numberOfElements - how many values to stuff into the file
   * @param FileHandler file - FileHandler to write data to
   * */
  public void fillFile(int numberOfElements, FileHandler file) {
    
    Random r = new Random(); 
    int max = 9999;
    
    for(int i = 0; i < numberOfElements; i++) {
      int randomValue = r.nextInt(max); 
      file.appendLine("" +randomValue);
    }
    
  }
  
}
