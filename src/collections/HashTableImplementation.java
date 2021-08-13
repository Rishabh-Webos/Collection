package collections;

import java.util.*;

public class HashTableImplementation {
	public void add(Hashtable<Integer,String> m,Integer key,String value) {
		m.put(key, value);
	}
	public static void main(String[] args) {
		Hashtable<Integer,String> hash=new Hashtable<>();
		HashTableImplementation htc=new HashTableImplementation();
		htc.add(hash,Integer.valueOf(1),"One");
		htc.add(hash,Integer.valueOf(2),"Two");
		htc.add(hash,Integer.valueOf(3),"Three");
		
	}
}
