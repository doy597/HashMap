// Iterator���g�킸�ɁAget()���\�b�h�����s������

import java.util.*;         //�@�@�\��ǂݍ���

class HashMapTest6{

	HashMapTest6(){			//�@�R���X�g���N�^
		HashMap map;		//�@�I�u�W�F�N�g�쐬
		map = new HashMap();	//�@�C���X�^���X��

		map.put( "Name", "Tanaka");
		map.put( "Age", new Integer(26));

		System.out.println( map );	
	}

	public static void main(String args[]){
		new HashMapTest6();
	}
}
	