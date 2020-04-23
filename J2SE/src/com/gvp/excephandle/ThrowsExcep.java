package com.gvp.excephandle;

import java.io.IOException;

public class ThrowsExcep {

	static void method() throws IOException {
		throw new IOException("device error");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}

}
