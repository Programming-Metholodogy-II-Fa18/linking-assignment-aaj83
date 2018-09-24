import java.util.SortedSet;
import java.util.TreeSet;
public class Problem4C {

	
		public static int problemFourC(int value) {
			SortedSet<Integer> set=new TreeSet<Integer>();

			for(int j=0; j<=value; j++) {

			for(int i=0; i<=value; i++) {

			for(int k=0; k<=value; k++) {

			int result=(int)(Math.pow(9, i)*Math.pow(15, j)*Math.pow(7, k));

			set.add(result);
			}
			}
			}
			return set.toArray(new Integer[set.size()])[value];

			}

			public static void main(String[] args) {

			System.out.println(problemFourC(7));

			}
	}


