import java.util.Scanner;
public class Jsq{
	public static void main(String args[]){
		System.out.println("�������һ����");
		Scanner sc = new Scanner(System.in);
		int shu1 = sc.nextInt();
		System.out.println("������ڶ�����");
		int shu2 = sc.nextInt();
		System.out.println("�ӷ�����");
		System.out.println(shu1+"+"+shu2+"="+(shu1+shu2));
		System.out.println("��������");
		System.out.println(shu1+"-"+shu2+"="+(shu1-shu2));
		System.out.println("�˷�����");
		System.out.println(shu1+"*"+shu2+"="+(shu1*shu2));
		System.out.println("��������");
		System.out.println(shu1+"/"+shu2+"="+(shu1/shu2));
	}
}