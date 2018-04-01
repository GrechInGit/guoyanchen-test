package com.guoyanchen.ch01;
/**
 * 
 * @author 郭彦辰
 *
 * 2017-10-2  下午02:56:29
 */
public class Vistor {
/**
 * 一个景区根据游人的年龄收取不同的价格
 * 十八岁以下门票免费，十八岁以上门票20
 * 
 * 游人类：   属性，姓名年龄
 *      方法：封装
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
