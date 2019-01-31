import java.util.ArrayList;
import java.util.Scanner; 

public class Mall {
	 //different Shopping Malls
	//(Ex:Natick Mall, Burlington Mall, Mall of America)
    

	public static void main(String[] args) {

System.out.println("Which mall would you like to visit");
ArrayList<String> Malls = new ArrayList<String>();
Malls.add("(n) Natick");
Malls.add("(b) Burlington");
Malls.add("(a) America");
System.out.println(Malls);


Scanner Mall = new Scanner(System.in); 
String answer = Mall.nextLine(); 
System.out.println(answer);

	}

}
