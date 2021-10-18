/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminalassessment;

/**
 * TerminalAssessment.java
 * 30/04/2021
 * @author Alexis Pechon (x19358953)
 */
public class TerminalAssessmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyArrayList binaryList = new MyArrayList<>();
        MyArrayList linearList = new MyArrayList<>();
        
        for(int i = 0; i < 35000; i++){
           
            //int randomNum = (int)(Math.random()*100000);
            //binaryList.add(new Integer (randomNum));
            
            binaryList.add(new Integer(1));
            binaryList.add(new Integer(2));
            binaryList.add(new Integer(3));
            binaryList.add(new Integer(5));
            binaryList.add(new Integer(10));
            binaryList.add(new Integer(15));
            binaryList.add(new Integer(27));
            binaryList.add(new Integer(100));
            binaryList.add(new Integer(104));
        }
        
        //Purpose of the for loop is to add the same elements from the binaryList to the linearList
        for(int i = 0; i < binaryList.size(); i++){
            linearList.add(i, binaryList.get(i));
        }
        
        
        //*Start of the Binary Search Algorithm*//
        long startTime = System.currentTimeMillis();
        
        Integer searchKey = 69;
        int binaryPosition = binaryList.BinarySearch(searchKey, 0, binaryList.size()-1);
        
        if(binaryPosition == -1){
            System.out.println("Search Key: " + searchKey + " has NOT been found!");
        }
        else{
            System.out.println("Search Key: " + searchKey + " HAS been FOUND!");
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("The time it took to performance the binary search was: " + (endTime - startTime) + " Milliseconds");       
        //*End of the Binary Search Algorithm*//
        
        // BREAK //
        
        //*Start of the Linear Search Algorithm*//
        long linearStartTime = System.currentTimeMillis();
        
        Integer newSearchKey = 420;
        int linearPosition = linearList.SequentialSearch(newSearchKey);
        
        if(linearPosition == -1){
            System.out.println("\nThe linear key: " + newSearchKey + " has NOT been found!");
        }
        else{
            System.out.println("\nThe linear key: " + newSearchKey + " has been FOUND!");
        }
        
        long linearEndTime = System.currentTimeMillis();
        
         System.out.println("The time it took to performance the linear search was: " + (linearEndTime - linearStartTime) + " Milliseconds");       
        //*End of the Linear Search Algorithm*//
    }
    
}
