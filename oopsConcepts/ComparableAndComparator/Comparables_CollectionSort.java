package oopsConcepts.ComparableAndComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Comparables_CollectionSort {
		
	public static void main(String[] args) 
    { 
        // Create a list of Integers 
        List<Point2> list = new ArrayList<Point2>(); 
        list.add(new Point2(5, 10)); 
        list.add(new Point2(2, 20));  
        list.add(new Point2(10, 30)); 
        
        // List is sorted in the natural order
        Collections.sort(list);
        
        // Displaying the points
        for (Point2 p: list)
            System.out.println(p.x + " " + p.y);
    } 
}

class Point2 implements Comparable<Point2>
{
    int x, y;
    Point2(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point2 P)
    {
        return this.x - P.x;
    }
}