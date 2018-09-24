import java.util.ArrayList;
public class problem4B {
	static void ProblemFourB(int[][]x,int y){
        int sum=y;
        ArrayList<Integer> list=new ArrayList<>();

        for(int t=0;t<x.length;t++){
            for(int s=0;s<x[t].length;s++){
              list.add(x[t][s]);
            }
        }
        for(int x1=0;x1<list.size();x1++) {
            int a = list.get(x1);
            for (int z = x1 + 1; z < list.size(); z++) {
                int b = list.get(z);
                if ((a + b) == sum) {
                    System.out.println("Sum " + y + ": ");
                    System.out.printf("(%d,%d)%n", a, b);
                }
            }
        }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
