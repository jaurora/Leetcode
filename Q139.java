import java.util.*;

public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
	if (dict.isEmpty()) return false;
	int len = s.length();
	boolean find = false;
	List<Integer> queue = new LinkedList<Integer>();
	queue.add(-1);

	for (int i = 0; i < len; i++) {
	    Iterator it = queue.iterator();
	    while (it.hasNext()) {
		Integer tmp = (Integer) it.next();
		if (dict.contains(s.substring(tmp.intValue()+1,i+1))) {
		    queue.add(i);
		    if (i == len-1) find = true;
		    break;
		}
	    }
	}
	return find;
    }
    
   public static void main(String[] args) {
       Solution slu = new Solution();
       String s = "ab";
       Set<String> st = new TreeSet<String>();
       st.add("a");
       //st.add("abc");
       st.add("b");
       //st.add("cd");
       System.out.println(slu.wordBreak(s, st));
   }
}
