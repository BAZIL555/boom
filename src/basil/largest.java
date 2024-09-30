package basil;

public class largest {

	public static void main(String[] args) {
			int a= 10;
			int b= 34;
			int c= 98;
			int largest;{
			if(a>=b&& a>=c) {
				largest = a;
			}else if(b>=a&& b>=c) {
				largest =b;
			}else {
				largest = c;
			}
			System.out.println("the largest number is:"+largest);

			}
	}
}
	
