package OP_0421;
public class OP_Test_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2��
		String str = "�谳��-2017��\nȫ�浿����-2015��\n���켱��-2018��";
		String [] name_s = str.replace("-", ":").split("\n");
		String [] s;
		String ch_str = "";
		System.out.println("====���� �� str====");
		System.out.println(str);
		System.out.println("====���� �� str====");
		for(int i=0;i<name_s.length;i++) {
			s = name_s[i].split(":");
			for(int j=0;j<2;j++) {
				if(j==1) {s[j] = ":1999��\n";}
				ch_str += s[j];
			}
		}
		System.out.println(ch_str);
	}

}
