package com.guoyanchen.ch02;
/**
 * 
 * @author ���峽
 *
 * 2017-10-3  ����12:29:32
 */
public class chengfabiao {

	/**
	 * 99�˷���
	 * ��i��i������
	 * ��i�е�һ����Ϊi,
	 * ��i������ڶ�����Ϊj��0�ӵ�i
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1;j<=i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}System.out.println("");//����
		}

	}

}
