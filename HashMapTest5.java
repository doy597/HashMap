//�@Iterator���g�킸�ɁAsize()���\�b�h�����s������

import java.util.*;         //�@�@�\��ǂݍ���

class HashMapTest5{

	HashMapTest5(){			//�@�R���X�g���N�^
		HashMap map;		//�@�I�u�W�F�N�g�쐬
		map = new HashMap();	 //�@�C���X�^���X��

		map.put( "Name", "Tanaka");
		map.put( "Age", new Integer(26));
		map.put( "Favoite food", "Niku");
		map.put( "Hobby", "Fishing");
        
		System.out.println( "�v�f�̌���" + map.size() + "�ł�" );	
	}
	public static void main(String[] args){
		new HashMapTest5();
	}
}
	