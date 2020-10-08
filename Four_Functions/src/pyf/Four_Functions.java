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
		for(i = -5;i<10;System.out.println("sigmoid������ֵ" + sigmoid(i) + "������X��ֵΪ" + i),i++);
	}
	
	public static void test_tanh() {
		double x = 0;
		int i = -5;
		for(i = -5;i<10;System.out.println("tanh������ֵ" + tanh(i) + "������X��ֵΪ" + i),i++);
	}
	
	public static void test_relu() {
		double x = 0;
		int i = -5;
		for(i = -5;i<10;System.out.println("relu������ֵ" + relu(i) + "������X��ֵΪ" + i),i++);
	}
	public static void test_swish() {
		double x = 0;
		int i = -5;
		for(i = -5;i<10;System.out.println("swish������ֵ" + swish(i) + "������X��ֵΪ" + i),i++);
	}
	
}
