package 생활코딩;

public class testcontorl {

	public static void main(String[] args) {

		System.out.println("who are you?");
		//test
		String [][] users = {
				{"id1", "password1"},
				{"id2", "password2"},
				{"id3", "password3"}
				};
		String inputid = args[0];
		String inputpassword = args[1];
		
		boolean input = false;
		
		for(int i = 0; i < users.length;i++) {
			String [] current = users[i];
				if(current[0].equals(inputid)&&current[1].equals(inputpassword)){
					input = true;
					break;
				}
		}
		
		if(input) {
			System.out.println("hi, master!");
		}else {
			System.out.println("sorry out plz");
		}
		}
	}
