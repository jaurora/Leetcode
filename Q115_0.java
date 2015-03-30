import java.util.*;

public class Solution {
    private char[] sc = null;
    public int numDistinct(String S, String T) {	

	List<List<Integer>> list = new ArrayList<List<Integer>>();
	sc = S.toCharArray();
	char[] tc = T.toCharArray();

	int slen = sc.length;
	int tlen = tc.length;
	
	for (int i = 0; i < tlen; i++) {
	    if (i > 0 && list == null) break;
	    list = find(list, tc[i]);	    
	}
	return list.size();
    }

    private List<List<Integer>> find(List<List<Integer>> list, char t) {
	List<List<Integer>> newlist = new ArrayList<List<Integer>>();
	int len = sc.length;
	for (int i = 0; i < len; i++) {
	    if (sc[i] == t) {
		if (list.size() == 0) {
		    List<Integer> tmp = new ArrayList<Integer>();
		    tmp.add(i);
		    newlist.add(tmp);
		} else {
		    for (int j = 0; j < list.size(); j++) {
			List<Integer> ll = list.get(j);
			if (ll.get(ll.size()-1) < i) {
			    List<Integer> tmp = new ArrayList<Integer>();
			    for (int p = 0; p < ll.size(); p++) tmp.add(ll.get(p));
			    tmp.add(i);
			    newlist.add(tmp);
			}
		    }
		}
	    }
	}
	return newlist;
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       String s = "absdb";
       String t = "ab";
       System.out.println(slu.numDistinct(s,t));
   }
}
