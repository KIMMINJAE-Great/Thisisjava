package no4;

public class Util {
	public static<k, v> v getValue(Pair<K,v> p, K k) {
		if(p.getKey()==k) {
			return p.getValue();
		}
		else
			 return null;
	}
}
