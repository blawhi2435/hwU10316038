import java.util.Scanner;
public class LinearEquation {

	public static void main(String[] args) {
		
		Equation equ = new Equation(0,0,0,0,0,0);
		System.out.println("Please enter six numbers: ");
		System.out.println("aX+bY=e");
		System.out.println("cX+dY=f");
		
		equ.getA();
		equ.getB();
		equ.getC();
		equ.getD();
		equ.getE();
		equ.getF();
		
		if(equ.isSolvable()){
			System.out.println("X ="+equ.getX()+" Y = "+equ.getY());
		}
		else{
			System.out.print("The equation has no solution");
		}
	}

}

class Equation{
	
	Scanner input = new Scanner(System.in);
	private int a,b,c,d,e,f;
	Equation(int a,int b,int c,int d,int e,int f){
		this.a = a;
		this.b = b;
		this.b = b;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	int getA(){
		a = input.nextInt();
		return a;
	}
	int getB(){
		b = input.nextInt();
		return b;
	}
	int getC(){
		c = input.nextInt();
		return c;
	}
	int getD(){
		d = input.nextInt();
		return d;
	}
	int getE(){
		e = input.nextInt();
		return e;
	}
	int getF(){
		f = input.nextInt();
		return f;
	}
	
	boolean isSolvable(){
		if((a*d) - (b*c) == 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	double getX(){
		return (double)(e*d - b*f)/(a*d - b*c);
	}
	
	double getY(){
		return (double)(a*f - e*c)/(a*d - b*c);
	}
	
	
	
}
