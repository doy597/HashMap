import java.util.*;	//　すべての機能を読み込む

class HashMapTest4{

	public static void main(String[] args){
		HashMap map = new HashMap();	 //インスタンス化

		map.put( "Name", "Tanaka");
		map.put( "Age", new Integer(26));

		Iterator it = map.keySet().iterator();
		while( it.hasNext()){	//　次の値が存在している場合は下記の処理をする
			Object o = it.next();
			System.out.println(o + "=" + map.get(o));
		}
	}
}