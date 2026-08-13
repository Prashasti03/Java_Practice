
public class ECalculator {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
	    char ch = '*';
	    
	    switch(ch) {
	    case '+' :
	    	System.out.println(num1+" + "+num2+" = "+(num1+num2));
	    	break;
	    case '-' :
	    	System.out.println(num1+" - "+num2+" = "+(num1-num2));
	    	break;
	    case '*' :
	    	System.out.println(num1+" * "+num2+" = "+(num1*num2));
	    	break;
	    case '/' :
	    	System.out.println(num1+"/"+num2+" = "+(num1/num2));
	    	break;
	    case '%' :
	    	System.out.println(num1+" % "+num2+" = "+(num1%num2));
	    	break;
	    default:
	    	System.out.println("Wrong Input");
	    }

	}

}
