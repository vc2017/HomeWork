import java.util.Scanner;
public class Jsq{
	public static void main(String args[]){
		System.out.println("请输入第一个数");
		Scanner sc = new Scanner(System.in);
		int shu1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int shu2 = sc.nextInt();
		System.out.println("加法运算");
		System.out.println(shu1+"+"+shu2+"="+(shu1+shu2));
		System.out.println("减法运算");
		System.out.println(shu1+"-"+shu2+"="+(shu1-shu2));
		System.out.println("乘法运算");
		System.out.println(shu1+"*"+shu2+"="+(shu1*shu2));
		System.out.println("除法运算");
		System.out.println(shu1+"/"+shu2+"="+(shu1/shu2));
	}
}