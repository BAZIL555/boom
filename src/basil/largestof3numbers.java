package basil;

public class largestof3numbers {
int a= 10;
int b= 34;
int c= 98;
int largestof3numbers;{
if(a>=b&& a>=c) {
	largestof3numbers = a;
}else if(b>=a&& b>=c) {
	largestof3numbers =b;
}else {
	largestof3numbers = c;
}
System.out.println("the largest number is:"+largestof3numbers);

}
}
