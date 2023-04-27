package com.maven.junitproject;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class JunitLifecycle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result r1=JUnitCore.runClasses(JunitLifecycle.class);
        
        for(Failure f:r1.getFailures())
        {
        	System.out.println(f.toString());
        }
        System.out.println("Result: "+r1.wasSuccessful());
	}

}
