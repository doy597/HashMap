import java.util.*;	//�@���ׂĂ̋@�\��ǂݍ���

class HashMapTest4{

	public static void main(String[] args){
		HashMap map = new HashMap();	 //�C���X�^���X��

		map.put( "Name", "Tanaka");
		map.put( "Age", new Integer(26));

		Iterator it = map.keySet().iterator();
		while( it.hasNext()){	//�@���̒l�����݂��Ă���ꍇ�͉��L�̏���������
			Object o = it.next();
			System.out.println(o + "=" + map.get(o));
		}
	}
}