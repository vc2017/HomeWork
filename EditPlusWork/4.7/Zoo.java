public class Zoo{
	public static void main(String args []){
		Dog erha = new Erha();
		//Dog tdi = new Tdi();
		wg(erha);
		//wg(tdi);
	}
	public static void wg(Dog dog){
		System.out.println("��һ��");
		if(dog instanceof Erha){
			((Erha)dog).biaoqing();
		}
		dog.eat();
	}
}