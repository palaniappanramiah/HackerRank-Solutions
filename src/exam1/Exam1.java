package exam1;
import java.util.*;
import java.util.Map.Entry;
public class Exam1 {

	public static void main(String args[]) {
		HashMap<String,Double> a = new HashMap<>();
		ValueComparator bvc =  new ValueComparator(a);
        TreeMap<String,Double> sorted_map = new TreeMap<String,Double>(bvc);
		a.put("pal", 20.0);
		a.put("pala", 10.0);
		a.put("pals", 15.0);
		sorted_map.putAll(a);
		int i=0;
        for (Entry<String, Double> entry : sorted_map.entrySet()) {
        	if(i<2){
        		System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        	i++;}
	}
	}
}
	class ValueComparator implements Comparator<String> {

	    Map<String, Double> base;
	    public ValueComparator(Map<String, Double> base) {
	        this.base = base;
	    }

	    // Note: this comparator imposes orderings that are inconsistent with equals.    
	    public int compare(String a, String b) {
	        if (base.get(a) >= base.get(b)) {
	            return -1;
	        } else {
	            return 1;
	        } // returning 0 would merge keys
	    }
}