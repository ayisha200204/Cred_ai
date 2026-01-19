import java.util.*; 
  
public class Geeks { 
  
    public static void main(String args[]) 
    { 
        LinkedList<String> ll 
            = new LinkedList<>(); 
  
        ll.add("Welcome to"); 
        ll.add("Programming"); 
        ll.add(1, "Java"); 
  
        
        for (int i = 0; i < ll.size(); i++) { 
  
            System.out.print(ll.get(i) + " "); 
        } 
  
        System.out.println(); 
  
        
        for (String str : ll) 
            System.out.print(str + " "); 
    } 
}