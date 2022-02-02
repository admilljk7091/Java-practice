class Cal2{
	int v1,v2;
	Cal2(int v1, int v2){
		System.out.println("Cal init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}
class cal3 extends Cal2{
	cal3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init!!");
	}
	public int minus() {return this.v1-v2;}
	
}
public class inheritanceapp2 {
	public static void main(String[] args) {
		Cal2 c = new Cal2(2,1);
		cal3 c3 = new cal3(2,1);
		
		System.out.println(c3.sum());//3
		System.out.println(c3.minus());//1

	}

}
