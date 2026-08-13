
public class COperators {
//	Arithmetic
//	Unary

	public static void main(String[] args) {
//		Arithmetic operator
		int a = 10;
		int b = 20;
		int sum = a+b;
		int sub = a-b;
		int mult = a*b;
		int div = a/b;
		int div2 = b/a;
		int mod = a%b;
		System.out.println("Arithmetic Operators : ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("Sum : "+sum);
		System.out.println("Sub :"+sub);
		System.out.println("Mult :"+mult);
		System.out.println("Div :"+div);
		System.out.println("Div2 :"+div2);
		System.out.println("Mod :"+mod);
		System.out.println("13%3 :"+(13%3));
		System.out.println("5%12 :"+(5%12));
		System.out.println("5.0%12.0 : "+((5.0)%(12.0)));
		
		System.out.println("-----------------------------------------");
		
//		Unary
		System.out.println("Post and Pre Increment and Decrement : ");
//		post increment
		System.out.println("a++ : "+(a++));
		System.out.println("a : "+a);
		
//		pre increment
		System.out.println("++a : "+(++a));
		System.out.println("a : "+(a) );
		
//		pre decrement
		System.out.println("--a : "+(--a));
		System.out.println("a : "+(a) );
		
//		post decrement
		System.out.println("a-- : "+(a--));
		System.out.println("a : "+a);
		
		System.out.println("-----------------------------------------");
		
//		relational
		System.out.println("Relational/Comparison Operators");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("a>b : "+ (a>b));
		System.out.println("a<b : "+ (a<b));
		System.out.println("a>=b : "+ (a>=b));
		System.out.println("a<=b : "+ (a<=b));
		System.out.println("a==b : "+ (a==b));
		System.out.println("a==10 : "+ (a==10));
		
		System.out.println("-----------------------------------------");
		
//		assignment
		System.out.println("Assignment Operators : ");
		System.out.println("a+=10 : "+(a+=10));
		System.out.println("a-=10 : "+(a-=10));
		System.out.println("a*=10 : "+(a*=10));
		System.out.println("a/=10 : "+(a/=10));
//		System.out.println("a%=10 : "+(a%=10));
		System.out.println("a%=3 : "+(a%=3));
		
		System.out.println("-----------------------------------------");
		
//		logical
		int c=10, d=20, e=30, f=40;
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);
		System.out.println("f : "+f);
		
		System.out.println("Logical And");
		
		System.out.println("c>d && e>f : "+(c>d && e>f));  // false
		System.out.println("c<d && e>f : "+(c<d && e>f));  // false
		System.out.println("c>d && e<f : "+(c>d && e<f));  // false
		System.out.println("c<d && e<f : "+(c<d && e<f));  // true
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Logical Or");
		
		System.out.println("c>d || e>f : "+(c>d || e>f));  // false
		System.out.println("c<d || e>f : "+(c<d || e>f));  // true
		System.out.println("c>d || e<f : "+(c>d || e<f));  // true
		System.out.println("c<d || e<f : "+(c<d || e<f));  // true
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Logical Not");
		
		boolean g = true;
		System.out.println("g : "+g);
		System.out.println("!g : "+(!g));

	}

}
