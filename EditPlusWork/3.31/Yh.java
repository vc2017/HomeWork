/**
���й���ϵͳ
���� ������ ȡ����
���� ��ѯ ���ڲ���
*/
public class Yh{
	//��������
	int cq;
	int qq;
	int ye;
	//��������
	public void cx(){
		System.out.println("���ڲ�ѯ���Ժ�...");
	}
	public void cz(){
		System.out.println("������");
	}
	//������
	public Yh(int cq,int qq){
		this.cq = cq;
		this.qq = qq;
	}
	//�����Ϣ
	public void say(){
		System.out.println("���������룺"+cq+"Ԫ��"+"ȡ����"+qq+"Ԫ��"+"��"+(cq-qq)+"Ԫ��");
	}

}