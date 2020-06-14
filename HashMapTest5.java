//　Iteratorを使わずに、size()メソッドを実行させる

import java.util.*;         //　機能を読み込む

class HashMapTest5{

	HashMapTest5(){			//　コンストラクタ
		HashMap map;		//　オブジェクト作成
		map = new HashMap();	 //　インスタンス化

		map.put( "Name", "Tanaka");
		map.put( "Age", new Integer(26));
		map.put( "Favoite food", "Niku");
		map.put( "Hobby", "Fishing");
        
		System.out.println( "要素の個数は" + map.size() + "です" );	
	}
	public static void main(String[] args){
		new HashMapTest5();
	}
}
	