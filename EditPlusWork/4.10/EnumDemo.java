enum color{
	red,bule,green;
	public String toString(){
		String ret = super.toString();
		switch (this){
			case red:
				ret = "��ɫ";
			break;
			case bule:
				ret = "��ɫ";
			break;
			case green:
				ret = "��ɫ";
			break;
			default :
				ret = "û��";
		}
		return ret;
	}
}
public class EnumDemo{
	public static void main(String [] args){
		color [] cs = color.values();
		for(color c:cs){
			System.out.print(c+"\t");
		}
		System.out.println(); 
	}
}