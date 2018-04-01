package com.guoyanchen.ch02;

import java.util.Scanner;

/**
 * 
 * @author 郭彦辰
 * 
 *         2017-10-2 下午11:34:43
 */
public class caizi {

	/**
	 * 
	 * 编写程序随即生成一个1-100之间的随机数。 程序提示用户输入一个数字，不停猜测，直到猜对为止。
	 * 最后输出猜测的数字，和猜测的次数。并且如果没有猜中要提示用户输入的值是大了还是小了。
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 100 + 1);
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入0-100之间一个数");
		int i = 1;
		int t;//需在方法外先定义变量
		do {
			 t = in.nextInt();
			if (t > a) {
				System.out.println("数值偏大，请重新输入");
			} else {
				System.out.println("数值偏小，请重新输入");
			}
			i++;
		} while (a !=t );
		
		System.out.println("匹配的数值为" + t + "输入次数为" + i);
	}
}
