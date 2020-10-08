package pyf;

import java.util.*;

public class Four_Functions {
	public static double sigmoid(double x) {
		return 1 / (1 + Math.pow(Math.E, -x));
	}
	public static double tanh(double x) {
		return (Math.pow(Math.E, x) - Math.pow(Math.E, -x)) / (Math.pow(Math.E, x) + Math.pow(Math.E, -x));
	}
	public static double relu(double x) {
		return Math.max(0, x);
	}
	public static double swish(double x) {
		return x * (1 / (1 + Math.pow(Math.E, -x)));
	}
	
	public static void main(String[] args)  
	{
		test_sigmoid();
		test_tanh();
		test_relu();
		test_swish();	
	}
	
	
	public static void test_sigmoid() {
		double x = 0;
		int i = -5;
		for(i = -5;i<10;System.out.println("sigmoid函数的值" + sigmoid(i) + "，变量X的值为" + i),i++);
	}
	
	public static void test_tanh() {
		double x = 0;
		int i = -5;
		for(i = -5;i<10;System.out.println("tanh函数的值" + tanh(i) + "，变量X的值为" + i),i++);
	}
	
	public static void test_relu() {
		double x = 0;
		int i = -5;
		for(i = -5;i<10;System.out.println("relu函数的值" + relu(i) + "，变量X的值为" + i),i++);
	}
	public static void test_swish() {
		double x = 0;
		int i = -5;
		for(i = -5;i<10;System.out.println("swish函数的值" + swish(i) + "，变量X的值为" + i),i++);
	}
	
}
