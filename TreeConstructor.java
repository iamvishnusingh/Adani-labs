import java.util.Scanner;
import java.util.TreeMap;

public class TreeConstructor 
{
//	public static String Substring(int i,int j) {
//		
//	}
	public static boolean TreeCons(String [] StrArr) {
		TreeMap<String, Integer> parents = new TreeMap<>();
	    TreeMap<String, Integer> children = new TreeMap<>();
	    for(String pair : StrArr){
	      String[] vals = pair.substring(1,pair.length()-1).split(",");
	      String child = vals[0];
	      String parent = vals[1];

	      if(!children.containsKey(child)) children.put(child, 1);
	      else children.put(child, children.get(child)+1);

	      if(!parents.containsKey(parent)) parents.put(parent, 1);
	      else parents.put(parent, parents.get(parent)+1);

	      if(children.get(child) > 1 || parents.get(parent) > 2){
	        return false;
	      }
	    }
	    return true;
	  }

public static void main(String[] args) {
	String [] input = {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
	System.out.println(TreeCons(input));
}
}
