/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package localshop;

import java.util.*;

/**
 *
 * @author Yo
 */
public class LocalShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set ShopA = new HashSet();
        Set ShopB = new HashSet();
        Set products = new HashSet();
        
        ShopA.add("Apple");
        ShopA.add("Ice");
        ShopA.add("Beer");
        ShopA.add("Thai rings");
        ShopA.add("Onion rings");
        ShopA.add("Heinekein");
        
        ShopB.add("Ice");
        ShopB.add("Thai rings");
        ShopB.add("Apple");
        ShopB.add("Singha beer");
        ShopB.add("Moji");
     
     System.out.println("Shop A is selling "+ ShopA);
     System.out.println("Shop B is selling "+ ShopB);
     
     products = Intersect(ShopA,ShopB);
     System.out.println("The common products between these shops are "+products);
     
     products = Union(ShopA,ShopB);
     System.out.println("All products of these shops "+products);
     
     products = DifferenceA(ShopA,ShopB);
     System.out.println("Exclusive products in Shop A are "+products);
     
     products = DifferenceB(ShopA,ShopB);
     System.out.println("Exclusive products in Shop B are "+products);
    }
    
    public static Set Intersect(Set s1, Set s2){
        Set ans = new HashSet(s1);
        ans.retainAll(s2);
        return ans;
    }
    
    public static Set Union(Set s1, Set s2){
        Set ans = new HashSet(s1);
        ans.addAll(s2);
        return ans;
    }
    
    public static Set DifferenceA(Set s1, Set s2){
        Set ans = new HashSet(s1);
        ans.removeAll(s2);
        return ans;
    }
    
    public static Set DifferenceB(Set s1, Set s2){
        Set ans = new HashSet(s2);
        ans.removeAll(s1);
        return ans;
    }
}
