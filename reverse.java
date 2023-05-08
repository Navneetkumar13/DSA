// Input: "My name is Xander"
// Output: "yM eman si rednaX";

public class Demo{
	
	public static String reverse(String str){
		String rev = "";
		int j=0;
		for(int i=0;i<str.length();i++){
			String temp = "";
			while(i<str.length()-1 && str.charAt(i) != ' '){
				temp = str.charAt(i) + temp;
				i++;
			}
			if(i == str.length()-1){
				temp = str.charAt(i) + temp;
			}
			rev = rev + temp + " ";
		}
		return rev;
	}
	
	public static void main(String args[]){
		String str = "My name is Navneet";
		System.out.println(reverse(str));
	}
}