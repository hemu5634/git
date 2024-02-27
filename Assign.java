import java.util.ArrayList;
import java.util.Scanner;

public class Assign1 {
	
	public static String matching(ArrayList<String> s){
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<s.get(i).length();i++){
			boolean b = true;
			for(int j=1;j<s.size();j++){
				if(s.get(j).contains(String.valueOf(s.get(i).charAt(i)))){
					continue;
				}
				else {
					b=false;
				}
			
			}
			if(b){
				sb.append(s.get(i).charAt(i));
			}
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Enter the string to be entered : ");
			String s = sc.next();
			str.add(s);
		}
		
		System.out.println(matching(str));
		

	}

}
