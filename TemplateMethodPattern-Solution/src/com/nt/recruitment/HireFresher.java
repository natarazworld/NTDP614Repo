package com.nt.recruitment;

public abstract class HireFresher {
	public  boolean  conductAptitudeTest() {
		  System.out.println("HireFresher.conductAptitudeTest()");
		  return true;
	}
	public  boolean  conductGDTest() {
		  System.out.println("HireFresher.conductGDTest()");
		  return true;
	}
	public abstract  boolean  conductTechnicalWrittenTest() ;
	public  abstract boolean  conductTechnicalInterviewTest() ;
	
	public  boolean  conductHRInterviewTest() {
		  System.out.println("HireFresher.conductInterviewTest()");
		  return true;
	}
	  //Template method DP  defining the alogrithm/skelton to complete the task
	public  boolean  fresherRecruitmentDrive() {
		  boolean  result=conductAptitudeTest();
		   if(result)
			    result=conductGDTest();
		   if(result)
			    result=conductTechnicalWrittenTest();
		   if(result)
			     result=conductTechnicalInterviewTest();
		   if(result)
			   result=conductHRInterviewTest();
		   
		   return result;
	}

}
