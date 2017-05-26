public class Main{
	public static void main(String args []){
		System.out.println("学生共有"+Student.numbers+"个。");//只有对类的操作 才可以用 static 来修饰 调用方法 类名.变量名
		Student s1 = new Student("李正利",20,'男');//char用单引号
		Student s2 = new Student("王文山",19,'女');
		Student s3 = new Student("王宁",20,'男');
		Student s4 = new Student("李祥",19,'女');
		Student s5 = new Student("孙士羽",17,'男');
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



		Train t1 = new Train("托马斯","客车",260,100);
		Train t2 = new Train("高登","货车",300,1000);
		Train t3 = new Train("佩西","军列车",500,3000);
		Train [] tt = new Train[3];
		tt[0]=t1;
		tt[1]=t2;
		tt[2]=t3;
		for(int j=0;j<tt.length;j++){//找不到变量名：查看变量名是否打错 创建时是否加了new
			tt[j].say();
		}
		t1.run();
		t2.stop();


		Teacher te1 = new Teacher("高",24,'女',"语文");
		Teacher te2 = new Teacher("刘",32,'男',"数学");
		Teacher te3 = new Teacher("王",27,'女',"英语");
		Teacher te4 = new Teacher("崔",23,'男',"体育");
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


		
		Computer c1 = new Computer("Hp-暗影精灵","i5-6300","GTX960","1TB",5099);
		Computer c2 = new Computer("Hp-光影精灵","i5-6300","GTX960","1TB",5099);
		Computer c3 = new Computer("神州-战神","i5-6300","GTX965","500G",4999);
		Computer c4 = new Computer("戴尔-游侠","i7-6700","GTX960","500G",6450);
		Computer c5 = new Computer("机械革命-深海泰坦","i7-6700","GTX965","1T",5999);
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


		Cellphone ce1 = new Cellphone("小米5","白色",5.1,1999.99);
		Cellphone ce2 = new Cellphone("华为荣耀畅玩5x","黑",5.1,1299.98);
		Cellphone ce3 = new Cellphone("乐视max","白色",6.5,1199.99);
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


		School so1 = new School("北京大学",70000,"北京市海淀区",195);
		School so2 = new School("清华大学",80000,"北京市海淀区",392);
		School so3 = new School("浙江大学",90000,"浙江省杭州市",513);
		School so4 = new School("山东大学",100000,"山东省济南市青岛市威海市",600);
		School [] oo = new School[4];
		oo[0] = so1;
		oo[1] = so2;
		oo[2] = so3;
		oo[3] = so4;
		for(int z=0;z<oo.length;z++){
			oo[z].say();
		}

		Wangzhe w1 = new Wangzhe("李白","狩猎","青莲剑阵","1v1");
		Wangzhe w2 = new Wangzhe("孙尚香","嗜血","翻滚突袭","5v5");
		Wangzhe w3 = new Wangzhe("吕布","兽痕","天魔乱舞","武道大会");
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