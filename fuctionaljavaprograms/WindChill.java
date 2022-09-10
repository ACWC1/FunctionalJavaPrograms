package com.fuctionaljavaprograms;

public class WindChill {

	public static void main(String[] args) {
		
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double wind = 0;
		
		System.out.println(" The Num 1 is : "+t+" \n The Num 2 is : "+v);
	
		if (t < 50 && 3 < v && v < 120) {
		wind = ((35.74 + 0.6215 * t + (0.4275 * t - 35.75)) * (Math.pow(v, 0.16)));
		System.out.println(wind);
		}
		else {
			System.out.println(" Temprature t should be less than 50 and wind speed v should be in range of 3 and 120 !!! ");
		}
	}

}
