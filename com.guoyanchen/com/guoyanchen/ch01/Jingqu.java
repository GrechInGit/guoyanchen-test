package com.guoyanchen.ch01;

import java.util.Scanner;

public class Jingqu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������������������䣺");
		Vistor xiaoming = new Vistor();
		xiaoming.setName(in.next());
		xiaoming.setAge(in.nextInt());
		System.out.println(xiaoming.getName()+"������Ϊ"+xiaoming.getAge()
				+"Ʊ��Ϊ��" + xiaoming.getPrice());

	}

}
