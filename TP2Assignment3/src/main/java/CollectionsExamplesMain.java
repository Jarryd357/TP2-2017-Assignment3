/*
TP Assignment 3 : Collections and Interfaces
Jarryd Pretorius
206155247
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import CollectionsExamples.CollectionsExamples;

public class CollectionsExamplesMain 
{
    public static void main(String [] args)
    {
        CollectionsExamples ce = new CollectionsExamples();
        
        System.out.println("List Example items:");
        ce.listExample();
        
        System.out.println("\nSet Example items:");
        ce.setExample();
        System.out.println("\nItem3 duplicate not printed in set");
        
        System.out.println("Map Example items:");
        ce.mapExample();
    }        
}
