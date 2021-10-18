/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminalassessment;

import java.util.ArrayList;

/**
 * MyArrayList.java
 * 30/04/2021
 * @author Alexis Pechon (x19358953)
 */
public class MyArrayList <Element> extends ArrayList <Element>{
    
    int upperComparison = 0;
    int lowerComparison = 0;
    int linearComparison = 0;
    
    //The Non-Recursive Binary Search Method
    public int BinarySearch(Element object, int start, int end){
        
        boolean found = false;
        int middle = 0;
        
        while((start <= end) && (found == false)){ //Start of while loop
            
            middle = (start + end)/2;
            
            if(((Comparable)get(middle)).compareTo((Comparable)object) == 0){
                //compareTo method returns -1, 0, +1
                //if the compareTo method returns 0 that means two of the items is the same
                found = true; //Resetting my flag
            }
            else if(((Comparable)get(middle)).compareTo((Comparable)object) < 0){ //smaller than 0
                start = middle + 1; //reset the start to be middle +1 to search the right side
                lowerComparison++;
                System.out.println("Lower Comparison: " + lowerComparison);
            }
            else{
                end = middle - 1; //reset the middle to check the lower half
                upperComparison++;
                System.out.println("Upper Comparisons: " + upperComparison);
                
            }
        } //End of while loop
        
        if(found == true){
            return middle; //returns the middle element in the binary search
        }
        else{
            return -1; //Return -1 = return not found
        }
    }
    
    
    //The method for the Unordered Sequential Linear Search
    public int SequentialSearch(Element key){
        
        int k;
        for(k = 0; k < size(); k++){
            if(((Comparable)get(k)).compareTo((Comparable)key) == 0){
                //System.out.println(key + " compare to " + get(k));               
                return k;
            }
            {
                //System.out.println(key + " compare to " + get(k));4
                linearComparison++;
                System.out.println("Linear Comparison: " + linearComparison);
            }
        }
        return -1;
    }
    
}
