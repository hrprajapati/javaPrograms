package javaC;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr = "Harsh Prajapati";
		String rev = "";
		for(int i=0 ;i<arr.length(); i++)
		{
			rev =  arr.charAt(i) + rev;
		}
		System.out.println(rev);
		

	}

}
