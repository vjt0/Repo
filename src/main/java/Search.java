
public class Search implements Demoin {
	public Search() {
		
	}
	
public void test() {
	int n=100;
	
	
	for(int i=1;i<=100;i++) {
		if(i%3==0&&i%5==0) {
			System.out.println("FizzBuzz");
		}
		else if(i%3==0&&i%5!=0) {
			System.out.println("Fizz");
		}
		else if(i%3!=0&&i%5==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(i);
		}
	}
	
	
		
}
	public static void main(String[] args) {
		Search s =new Search();
		s.test();		

	}

	
	public void run() {
		System.out.println(i+10);
	}
	public void rerun() {
		System.out.println(i);
	}


	@Override
	public void implement() {
		// TODO Auto-generated method stub
		
	}

}

