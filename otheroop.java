import java.io.FileWriter;
import java.io.IOException;
import java.security.spec.ECFieldF2m;

public class otheroop {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		
	
		FileWriter f1= new FileWriter("data.txt");
		f1.write("hello");
		f1.write("JAVA");
		f1.close();
				

	}

}
