
public class Problem4A {
	static void ProblemFourA(String string){
		StringBuilder reverse = new StringBuilder();
		for(int i = string.length()-1;i >= 0;i--){
            reverse.append(string.charAt(i));
        }
        System.out.println(reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
