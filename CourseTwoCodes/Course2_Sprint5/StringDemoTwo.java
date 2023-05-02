package Course2_Sprint5;
import java.util.Scanner;

public class StringDemoTwo{
	public static void main(String args[]){
		StringDemoTwo obj=new StringDemoTwo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username : ");
		String username=sc.next();
		System.out.println("enter password : ");
		String password=sc.next();
		System.out.println("Username is James and password is password@123 : " + obj.checkUserNameAndPassword(username,password));
		System.out.println(obj.welcomeMsg(username));
		//System.out.println("Password less than 15 alphabets : " +obj.isPasswordLessThan15(password));

	}

	public boolean isPasswordLessThan15(String password){
		if(password.length()<15)
			return true;
		else
			return false;
	}

	public boolean checkUserNameAndPassword(String username,String password){
		if(username.equals("James") && password.equals("password@123"))
			return true;
		else
			return false;
	}

	public String welcomeMsg(String username){
		String userUpper=username.toUpperCase();
		return "Welcome".concat(", ").concat(userUpper);
	}
}