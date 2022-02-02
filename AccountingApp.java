class Accounting{
	//...
    public double valueOfSupply;
    //...
    public static double vatRate = 0.1;
    // static은 어떤값이든 동일하기에 static을 사
    
    public Accounting (double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply; //this 는 변수, 없는건 매개변수 parameter
    } //생성자 형성으로 무조건 처음 시작시 넣어야하는 입력값이 생김으로 오류 발생 x
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);
        Accounting a2 = new Accounting(20000.0); //클래스의 속성이 계속 바뀌어야
//       하는 상황에서는 클래스보다 인스턴스가 낫다.
        
        
        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
        
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());
        
        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());
  
    }
}