public class Cx{
	public static void main(String args []){
		Person c = new wq();
		c.show();
	}
}
	abstract class Person {
		abstract void eat();
		abstract void zuo();
		abstract void show();
	}
	class wq extends Person{
		public void eat(){
			System.out.println("一根根");
		}
		public void zuo(){
			System.out.println("板正");
		}
		public void show(){
			eat();
			zuo();
		}
	}
	class eq extends Person{
		public void eat(){
			System.out.println("大碗");
		}
		public void zuo(){
			System.out.println("二郎腿");
		}
		public void show(){
			eat();
			zuo();
		}
	}