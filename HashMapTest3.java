import java.util.*;	//　ユーティリティの中のすべての機能を読み込む

class HashMapTest3{
	public static void main(String[] args){
		HashMap map = new HashMap();	//　インスタンス化

		map.put("Name", "Tanaka");
		map.put("Age" ,new Integer(26));
		
		System.out.println("Name ="+map.get("Name"));
		System.out.println("Age ="+map.get("Age"));

	}
}