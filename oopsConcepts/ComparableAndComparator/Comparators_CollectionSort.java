package oopsConcepts.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point3
{
    int x, y;
    Point3(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// This class implements 
// Comparator interface
class MyCmp3 implements Comparator<Point3>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point3 p1, Point3 p2)
    {
        return p1.x - p2.x;
    }
}

// Main Class
class Comparators_CollectionSort 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of Integers 
        List<Point3> list = new ArrayList<Point3>(); 
        list.add(new Point3(5, 10)); 
        list.add(new Point3(2, 20));  
        list.add(new Point3(10, 30)); 
        
        // List is sorted in natural order
        // Passing the list and MyCmp object
        Collections.sort(list, new MyCmp3());
        
        // Displaying the points
        for (Point3 p: list)
            System.out.println(p.x + " " + p.y);
    } 
} 
