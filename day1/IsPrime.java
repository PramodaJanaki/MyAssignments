package week1.day1;

import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int count=0;
		for(int i=1;i<=10;i++) {
		if(num%i==0) {
			count++;
		}
		}
		if (count==2) {
			System.out.println("The number is prime");
		}
			else {
				System.out.println("The number is not prime");
			}
		
		}
		
		}
		
			
	
	
	