package com.guoyanchen.ch02;
/**
 * 
 * @author 郭彦辰
 *
 * 2017-10-3  上午12:29:32
 */
public class chengfabiao {

	/**
	 * 99乘法表
	 * 第i行i个运算
	 * 第i行第一个数为i,
	 * 第i个运算第二个数为j从0加到i
	 * 
	 */
	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1;j<=i; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}System.out.println("");//换行
		}

	}

}
