/**
������ҫ��
����/�ֶ� Ӣ�� ���� ���� ģʽ
���� ���� �ƶ�
*/
public class Wangzhe{
	//��������
	String name;
	String mname;
	String jname;
	String moshi;
	//��������
	public void pa(){
		System.out.println("���� 1288");
	}
	public void mod(){
		System.out.println("��ǰ���� 1024");
	}
	//������
	public Wangzhe(String name,String mname,String jname,String moshi){
		this.name = name;
		this.mname = mname;
		this.jname = jname;
		this.moshi = moshi;
	}
	//���������ҫ������Ϣ
	public void say(){
		System.out.println("Ӣ�ۣ�"+name+"�����ʺ�����"+mname+"�����ļ���"+jname+"���ʺ�ģʽ"+moshi+"��");
	}
}