/**
������
���ԣ�����Ʒ�� ������ cpu �ڴ�
���������� �ػ� ����
*/
public class Computer{
	//���� ���� 
	String name;//����Ʒ��
	String clq;//������
	String cpu;//cpu
	String nc;//�ڴ�
	int price;
	//���� ����
	public void open(){
		System.out.println("���ڿ��������Ժ�");
	}
	public void close(){
		System.out.println("���ڹػ�");
	}
	public void yuxing(){
		System.out.println("�������У���ӭʹ�ñ������");
	}
	//������
	public Computer(String name,String cpu,String clq,String nc,int price){
		this.name = name;
		this.cpu = cpu;
		this.clq = clq;
		this.nc = nc;
		this.price = price;
	}
	//������Ի�����Ϣ
	public void say(){
		System.out.println(name+"��"+cpu+"��"+clq+","+nc+"��"+price+"Ԫ��");
	}
}