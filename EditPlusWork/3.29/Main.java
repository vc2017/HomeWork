public class Main{
	public static void main(String args []){
		System.out.println("ѧ������"+Student.numbers+"����");//ֻ�ж���Ĳ��� �ſ����� static ������ ���÷��� ����.������
		Student s1 = new Student("������",20,'��');//char�õ�����
		Student s2 = new Student("����ɽ",19,'Ů');
		Student s3 = new Student("����",20,'��');
		Student s4 = new Student("����",19,'Ů');
		Student s5 = new Student("��ʿ��",17,'��');
		Student [] ss = new Student[5];
		ss[0]=s1;
		ss[1]=s2;
		ss[2]=s3;
		ss[3]=s4;
		ss[4]=s5;
		for(int i=0;i<ss.length;i++){
			ss[i].say();
		}
		s1.play();



		Train t1 = new Train("����˹","�ͳ�",260,100);
		Train t2 = new Train("�ߵ�","����",300,1000);
		Train t3 = new Train("����","���г�",500,3000);
		Train [] tt = new Train[3];
		tt[0]=t1;
		tt[1]=t2;
		tt[2]=t3;
		for(int j=0;j<tt.length;j++){//�Ҳ������������鿴�������Ƿ��� ����ʱ�Ƿ����new
			tt[j].say();
		}
		t1.run();
		t2.stop();


		Teacher te1 = new Teacher("��",24,'Ů',"����");
		Teacher te2 = new Teacher("��",32,'��',"��ѧ");
		Teacher te3 = new Teacher("��",27,'Ů',"Ӣ��");
		Teacher te4 = new Teacher("��",23,'��',"����");
		Teacher [] te = new Teacher[4];
		te[0]=te1;
		te[1]=te2;
		te[2]=te3;
		te[3]=te4;
		for(int a=0;a<te.length;a++){
			te[a].say();
		}
		te1.sk();
		te2.xk();
		te3.xx();


		
		Computer c1 = new Computer("Hp-��Ӱ����","i5-6300","GTX960","1TB",5099);
		Computer c2 = new Computer("Hp-��Ӱ����","i5-6300","GTX960","1TB",5099);
		Computer c3 = new Computer("����-ս��","i5-6300","GTX965","500G",4999);
		Computer c4 = new Computer("����-����","i7-6700","GTX960","500G",6450);
		Computer c5 = new Computer("��е����-�̩̹","i7-6700","GTX965","1T",5999);
		Computer [] cc = new Computer[5];
		cc[0]=c1;
		cc[1]=c2;
		cc[2]=c3;
		cc[3]=c4;
		cc[4]=c5;
		for(int b=0;b<cc.length;b++){
			cc[b].say();
		}
		c1.open();
		c3.close();
		c5.yuxing();


		Cellphone ce1 = new Cellphone("С��5","��ɫ",5.1,1999.99);
		Cellphone ce2 = new Cellphone("��Ϊ��ҫ����5x","��",5.1,1299.98);
		Cellphone ce3 = new Cellphone("����max","��ɫ",6.5,1199.99);
		Cellphone [] ce = new Cellphone[3];
		ce[0] = ce1;
		ce[1] = ce2;
		ce[2] = ce3;
		for(int v=0;v<ce.length;v++){
			ce[v].say();
		}
		ce3.open();
		ce1.music();
		ce1.games();
		ce2.close();


		School so1 = new School("������ѧ",70000,"�����к�����",195);
		School so2 = new School("�廪��ѧ",80000,"�����к�����",392);
		School so3 = new School("�㽭��ѧ",90000,"�㽭ʡ������",513);
		School so4 = new School("ɽ����ѧ",100000,"ɽ��ʡ�������ൺ��������",600);
		School [] oo = new School[4];
		oo[0] = so1;
		oo[1] = so2;
		oo[2] = so3;
		oo[3] = so4;
		for(int z=0;z<oo.length;z++){
			oo[z].say();
		}

		Wangzhe w1 = new Wangzhe("���","����","��������","1v1");
		Wangzhe w2 = new Wangzhe("������","��Ѫ","����ͻϮ","5v5");
		Wangzhe w3 = new Wangzhe("����","�޺�","��ħ����","������");
		Wangzhe [] wz = new Wangzhe[3];
		wz[0] = w1;
		wz[1] = w2;
		wz[2] = w3;
		for(int w=0;w<wz.length;w++){
			wz[w].say();
		}
		w1.mod();
		w2.pa();
	}
}