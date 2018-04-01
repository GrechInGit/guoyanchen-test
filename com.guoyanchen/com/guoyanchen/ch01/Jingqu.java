package com.guoyanchen.ch01;

import java.util.Scanner;

public class Jingqu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的姓名和年龄：");
		Vistor xiaoming = new Vistor();
		xiaoming.setName(in.next());
		xiaoming.setAge(in.nextInt());
		System.out.println(xiaoming.getName()+"的年龄为"+xiaoming.getAge()
				+"票价为：" + xiaoming.getPrice());

	}

}
