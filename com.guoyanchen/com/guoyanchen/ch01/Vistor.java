package com.guoyanchen.ch01;
/**
 * 
 * @author ���峽
 *
 * 2017-10-2  ����02:56:29
 */
public class Vistor {
/**
 * һ�������������˵�������ȡ��ͬ�ļ۸�
 * ʮ����������Ʊ��ѣ�ʮ����������Ʊ20
 * 
 * �����ࣺ   ���ԣ���������
 *      ��������װ
 */
	private String name;
	private int age;
	private int price;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {

		return age;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		if (getAge() > 0&&getAge()<18) {
			price=0;
		}else{
			price=20;
	}return price;
	}
	public Vistor(){
		
	}
	public Vistor(String name,int age){
		this.name=name;
		this.age=age;
	}
}
