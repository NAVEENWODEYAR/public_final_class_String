package com.string.series;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jul-2024
 * @apiNote 
 */
public class FibonacciSeries {

	public static void fiboNacciSeries(int n) {
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<n;i++) {
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;
		}
		
		List<Integer> list = Stream.iterate(new int[] {0,1},s->new int[] {s[1],s[0]+s[1]}).limit(n).map(x->x[0]).toList();
	}
	
	public static void main(String[] args) {
		fiboNacciSeries(15);
	}

}
