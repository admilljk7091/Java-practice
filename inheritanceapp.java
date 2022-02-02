class cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int sum(int v1, int v2, int v3) {
		return v1+v2+v3;
	}
}

class ca3 extends cal{ //ca3는 자식 클래스 cal은 부모클래스
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	public int multiply (int v1, int v2) {
		return v1 * v2;
	}
	
	public int divide (int v1, int v2) {
		return  v1 / v2;
	}
	
}


public class inheritanceapp {

	public static void main(String[] args) {

		cal c = new cal();
		ca3 c3 = new ca3();
		System.out.println(c.sum(1,1, 3));
		System.out.println(c3.sum(2, 6));
		System.out.println(c3.minus(2, 6));
		System.out.println(c3.multiply(2, 6));
		System.out.println( c3.divide(4, 2));
		
	}

}
