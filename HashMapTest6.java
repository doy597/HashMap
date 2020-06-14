// Iteratorを使わずに、get()メソッドを実行させる

import java.util.*;         //　機能を読み込む

class HashMapTest6{

	HashMapTest6(){			//　コンストラクタ
		HashMap map;		//　オブジェクト作成
		map = new HashMap();	//　インスタンス化

		map.put( "Name", "Tanaka");
		map.put( "Age", new Integer(26));

		System.out.println( map );	
	}

	public static void main(String args[]){
		new HashMapTest6();
	}
}
	