package edu.cs.ship.rs0699.csc310.randomgenerator;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    String smallFile = "SmallSamples/SmallSample";
    String mediumFile = "MediumSamples/MediumSample";
    String largeFile = "LargeSamples/LargeSample";
    NumberGenerator numGen = new NumberGenerator();

    System.out.println("Generating small sample files");
    generateSortedData();
    generateRevseSortedData();
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
  
  public static void generateSortedData() {

	    String smallFile = "SortedSmallSamples/SortedSmallSample";
	    NumberGenerator numGen = new NumberGenerator();
	  
	    System.out.println("Generating small sample files");
	    for(int i = 1; i < 31; i++) {
	    	
	    	int[] output = convertArrayToInt(numGen.generateIntList(10000));
	    	
	    	QuickSort qs = new QuickSort(output);
	    	
	    	qs.quickSort(0, 9999);
	    	int[] results = qs.getDataSet();
	    	
	      FileHandler fh = new FileHandler(smallFile + i + ".txt");
	      
	      for (int j = 0; j < results.length; j++) {
	    	  fh.appendLine("" + results[j]);
	      }

	      
	      System.out.println("Generated "+ i + "/30 files");
	    }
  }
  
  public static void generateRevseSortedData() {

	    String smallFile = "ReverseSortedSmallSamples/ReverseSortedSmallSample";
	    NumberGenerator numGen = new NumberGenerator();
	  
	    System.out.println("Generating small sample files");
	    for(int i = 1; i < 31; i++) {
	    	
	    	int[] output = convertArrayToInt(numGen.generateIntList(10000));
	    	
	    	QuickSort qs = new QuickSort(output);
	    	
	    	qs.quickSort(0, 9999);
	    	qs.reverseDataSet();
	    	int[] results = qs.getDataSet();
	    	
	      FileHandler fh = new FileHandler(smallFile + i + ".txt");
	      
	      for (int j = 0; j < results.length; j++) {
	    	  fh.appendLine("" + results[j]);
	      }

	      
	      System.out.println("Generated "+ i + "/30 files");
	    }
  }
  
	/**@deprecated
	 * */
	public static int[] convertArrayToInt(ArrayList<Integer> dataSet) {
		int[] output = new int[dataSet.size()];
		
		for(int i = 0; i < dataSet.size(); i++) {
			
			output[i] = dataSet.get(i);
			
		}
		
		return output;
		
	}
  
}
