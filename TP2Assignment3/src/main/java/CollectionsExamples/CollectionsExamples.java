/*
TP Assignment 3 : Collections and Interfaces
Jarryd Pretorius
206155247
 */

package CollectionsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class CollectionsExamples 
{
    
    public CollectionsExamples()
    {

    }
    
    public void listExample()
    {        
        List listExample = new ArrayList();
        
        listExample.add("Item1");
        listExample.add("Item2");
        listExample.add("Item4");
        listExample.add("Item5");
        listExample.add(2,"Item3");
        
        System.out.print(listExample);
    }
    
    public void setExample()
    {        
        Set setExample = new HashSet();
        
        setExample.add("Item1");
        setExample.add("Item2");
        setExample.add("Item3");
        setExample.add("Item3"); //duplicate value won't add in Set
        
        System.out.print(setExample);
    }
    
    public void mapExample()
    {        
        Map mapExample = new HashMap();
        
        mapExample.put("01", "Item1");
        mapExample.put("02", "Item2");
        mapExample.put("03", "Item3");
    
        System.out.print(mapExample);
    } 
    
}
