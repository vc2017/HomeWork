class Outer{
	static class StaticInner{
		public void show(){
			System.out.println("��̬�ڲ���ʵ������");
		}
		public static void staticShow(){
			System.out.println("��̬�ڲ��ྲ̬����");
		}
	}
}
public class StaticInnerClassDemo3{
	public static void main(String [] args){
		Outer.StaticInner.staticShow();
		new Outer.StaticInner().show();
	}
}