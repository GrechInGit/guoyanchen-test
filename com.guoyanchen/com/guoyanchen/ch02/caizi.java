package com.guoyanchen.ch02;

import java.util.Scanner;

/**
 * 
 * @author ���峽
 * 
 *         2017-10-2 ����11:34:43
 */
public class caizi {

	/**
	 * 
	 * ��д�����漴����һ��1-100֮���������� ������ʾ�û�����һ�����֣���ͣ�²⣬ֱ���¶�Ϊֹ��
	 * �������²�����֣��Ͳ²�Ĵ������������û�в���Ҫ��ʾ�û������ֵ�Ǵ��˻���С�ˡ�
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 100 + 1);
		Scanner in = new Scanner(System.in);
		
		System.out.println("������0-100֮��һ����");
		int i = 1;
		int t;//���ڷ������ȶ������
		do {
			 t = in.nextInt();
			if (t > a) {
				System.out.println("��ֵƫ������������");
			} else {
				System.out.println("��ֵƫС������������");
			}
			i++;
		} while (a !=t );
		
		System.out.println("ƥ�����ֵΪ" + t + "�������Ϊ" + i);
	}
}
