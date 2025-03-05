import java.util.*;
public class mapOperations {
	public static void main(String[] args) {
		Map m = new HashMap();
		
		m.put(1, "Sani");
		m.put(2, "Gaurav");
		m.put(4, "Pavan");
		m.put(5, "Harshal");
		m.put(6, "Kaushal");
		m.put(7, "Dnyaneshwar");
		m.put(8, "Kaushal");
		m.put(9,  "Sagar");
		m.put(10,  "Kunal");

		for(Integer key : map.keySet())
		{
			System.out.println("Key : " + key + ", Value : " + map.get(key));
		}
	}

}
