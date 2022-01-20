package com.nt.test;

import com.nt.recruitment.HireJavaFresher;

public class Recruiter1 {
	public static void main(String[] args) {
		HireJavaFresher javaFresher = new HireJavaFresher();
		boolean flag = true;
		if (!javaFresher.conductAptitudeTest())
			flag = false;
		if (!javaFresher.conductGDTest())
			flag = false;
		if (!javaFresher.conductJavaWritternTest())
			flag = false;
		if (!javaFresher.conductJavaTechnicalTest())
			flag = false;
		if (!javaFresher.conductHRTest())
			flag = false;
		if (flag)
			System.out.println("Java Fresher Recruited");
		else
			System.out.println("Java Fresher not Recruited");

	}

}
