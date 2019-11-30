package Ex1;
import java.util.ArrayList;
/**
 * This class represents a simple (naive) tester for the Monom class, 
 * Note:                                   <br>
 * (i) The class is NOT a JUNIT - (i.e., educational reasons) - should be changed to a proper JUnit in Ex1. <br>
 * (ii) This tester should be extend in order to test ALL the methods and functionality of the Monom class.  <br>
 * (iii) Expected output:                  <br>
 * *****  Test1:  *****                    <br>
0) 2.0    	isZero: false	 f(0) =  2.0   <br>
1) -1.0x    isZero: false	 f(1) = -1.0   <br>
2) -3.2x^2  isZero: false	 f(2) = -12.8  <br>
3) 0    	isZero: true	 f(3) =  0.0   <br>
*****Test2:*****                           <br>
0) 0    	isZero: true  	eq: true       <br>
1) -1.0    	isZero: false  	eq: true       <br>
2) -1.3x   	isZero: false  	eq: true       <br>
3) -2.2x^2 	isZero: false  	eq: true       <br>
***** Test3: *****                         <br>
0) 2.0      2*Monom:4.0     Monom^2:4.0    <br>
1) -1.0x	2*Monom:-2.0x	Monom^2:1.0x^2 <br>
2) -3.2x^2	2*Monom:-6.4x^2	Monom^2:10.24^4<br>
3) x^2		2*Monom:2x^2	Monom^2:1.0x^4 <br>
***** ErorTesting: *****                   <br>
0) 3a	toString:Illegal char
1) x^2  add(x):Cant add different powers
2) x^-2	toString:Negative power.
*/
public class MonomTest {
	public static void main(String[] args) {
	//	test1();
	//	test2();
	//	test3();
		erorTesting();
	}
	private static void test1() {
		System.out.println("*****  Test1:  *****");
		String[] monoms = {"2", "-x","-3.2x^2","0"}; //{"2", "-x","-3.2x^2","0"};
		for(int i=0;i<monoms.length;i++) {
			Monom m = new Monom(monoms[i]);
			String s = m.toString();
			m = new Monom(s);
			double fx = m.f(i);
			System.out.println(i+") "+m +"    \tisZero: "+m.isZero()+"\t f("+i+") = "+fx);
		}
	}
	private static void test2() {
		System.out.println("*****  Test2:  *****");
		ArrayList<Monom> monoms = new ArrayList<Monom>();
		monoms.add(new Monom(0,5));
		monoms.add(new Monom(-1,0));
		monoms.add(new Monom(-1.3,1));
		monoms.add(new Monom(-2.2,2));
		
		for(int i=0;i<monoms.size();i++) {
			Monom m = new Monom(monoms.get(i));
			
			String s = m.toString();
			
			Monom m1 = new Monom(s);
			boolean e = m.equals(m1);
			
			System.out.println(i+") "+m +"    \tisZero: "+m.isZero()+"  \teq: "+e);
		}
	}
	private static void test3() {
		System.out.println("*****  Test3:  *****");
		String[] monoms = {"2", "-x","-3.2x^2","x^2"};
		for (int i = 0; i < monoms.length; i++) {
			Monom temp = new Monom(monoms[i]);
			Monom temp2 = new Monom(monoms[i]);
			String x = temp.toString();
			
			temp.add(temp);
			temp2.multipy(temp2);
			
			System.out.println(i+")"+"Monom:"+x+"\t2*Monom="+temp+"\tMonom^2="+temp2);
			
			
		}
	}
	/**
	 * eror tester.
	 * enable manually.
	 */
	
	private static void erorTesting() {
	//	Monom x = new Monom ("3a");
	//	Monom y = new Monom ("x^2");
	//	Monom y1 = new Monom ("x");
		Monom z = new Monom ("x^-2");
	//	y.add(y1);
		
		
	}
	
	}


