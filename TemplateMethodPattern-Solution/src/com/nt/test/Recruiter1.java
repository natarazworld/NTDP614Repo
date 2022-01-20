//ClientApp
package com.nt.test;

import com.nt.factory.HireFresherFactory;
import com.nt.recruitment.HireFresher;
import com.nt.recruitment.HireJavaFresher;

public class Recruiter1 {
	public static void main(String[] args) {
		HireFresher fresher=HireFresherFactory.getInstance("java");
		boolean result=fresher.fresherRecruitmentDrive();
		System.out.println("Fresher recruited:"+result);
		
	}

}
