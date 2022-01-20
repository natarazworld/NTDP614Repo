package com.nt.test;

import com.nt.recruitment.HireDotNetFresher;

public class Recruiter2 {
	public static void main(String[] args) {
		HireDotNetFresher dotNetFresher = new HireDotNetFresher();
		boolean flag = true;
		if (!dotNetFresher.conductAptitudeTest())
			flag = false;
		if (!dotNetFresher.conductGDTest())
			flag = false;
		if (!dotNetFresher.conductDotNetWritternTest())
			flag = false;
		if (!dotNetFresher.conductDotNetTechnicalTest())
			flag = false;
		if (!dotNetFresher.conductHRTest())
			flag = false;
		if (flag)
			System.out.println("DotNet Fresher Recruited");
		else
			System.out.println("DotNet Fresher not Recruited");

	}

}
