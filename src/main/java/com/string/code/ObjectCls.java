package com.string.code;
/**
 * @author Naveen K Wodeyar
 * @date 09-Jul-2024
 */
public class ObjectCls {

	public static void main(String[] args) {
		Object obj = 123;
		if(obj instanceof String s) {
			System.out.println(s.length());
		}else {
			System.out.println(obj.getClass());
		}
	}

}
