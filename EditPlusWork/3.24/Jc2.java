public class Jc2{
	public static void main(String args[]){
		int a=1,b=1,sum=0;
		do{
			b=a*b;
			sum=sum+b;
			a++;
		}while(a<=10);
		System.out.println(sum);
	}
}
