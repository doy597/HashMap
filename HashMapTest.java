import java.util.*;	//‹@”\‚ğ“Ç‚İ‚Ş

class HashMapTest3{
	public static void main(String[] args){
		HashMap map = new HashMap();

		map.put("Name", "Tanaka");
		map.put("Age" ,new Integer(26));
		
		System.out.println("Name ="+map.get("Name"));
		 System.out.println("Age ="+map.get("Age"));

	}
}