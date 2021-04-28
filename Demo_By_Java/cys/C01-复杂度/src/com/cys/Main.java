package com.cys;

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int first = 0;
        int second = 1;
        for (int i = 0; i < n-1; i++) {
			int sum = first + second;
			first = second;
			second = sum;
		}
        return second;
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib1(35));
		System.out.println(fib2(50));// 打印负数是因为超过了整数的范围
	}
	
	/*  斐波那契数列
	 *  0 1 2 3 4 5 6 7  8  ...
	 *  0 1 1 2 3 5 8 13 21 ...
	 */
	
	/**
	 * 递归求斐波那契数 
	 * ⚠️当索引过大时，性能不足导致难以计算️  
	 * @param n 第n个斐波那契数
	 * @return 第n个斐波那契数的值
	 */
	public static int fib1(int n) {
		// 看函数 fib1 被调用多少次，就花了多少时间
		// 详细复杂分析看课件
		// O(2^n)
		if (n <= 1) return n;
		return fib1(n-1) + fib1(n-2);
	}
	
	public static int fib2(int n) {
		// O(n)
		// 2+2
		if (n <= 1) return n;
		int first = 0;
		int second = 1;
		// 1 + n-1 + n-1 + 3(n-1)
		for (int i = 0; i < n-1; i++) {
			int sum = first + second;
			first = second;
			second = sum;
		}
		return second;
	}
	
}

/*
 *  判断复杂度的方法：
 *  1.事后统计法：执行效率
 *  - 使用程序测量方法执行的时间
 *  - 见 01-复杂度 Times
 *  2.时间复杂度：大O表示法
 *  - 估算每行代码执行次数的总和
 *  - 见 01-复杂度 test1-test7 的复杂度分析
 *  3.空间复杂度：大O表示法
 *  - 估算代码需要使用的存储空间
 * 	
 * 	对比 fib1 和 fib2 的差距，有时算法间的差距比硬件间的差距大
 */
