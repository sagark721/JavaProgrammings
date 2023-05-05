package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class BinarySearchOptimization {

	public static void main(String[] args) {

		int[] a= {10,20,50,80,100,200,120,350,30,70};
		
		
		//int low=0;
		//int high=a.length-1;
		//int mid=(low+high)/2;
		//int key=50;
		int count=0;
		//int iteration=0;
		Arrays.sort(a);
		
		
		
		TreeMap hm=new TreeMap();
		
		for(int i=0;i<a.length;i++) {
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		int key=a[i];
		int iteration=0;
		
		//10,20,30,50,70,80,100,120,200,350
		while(low<=high) {
			if(key==a[mid] || key==a[high] || key==a[low]) {
				//System.out.println(key+" Found in Array.");
				iteration++;
				break;
			}
			else if(key<a[mid]) {
				high=mid-1;
				iteration++;
			}
			else {
				low=mid+1;
				iteration++;
			}
			
			mid=(high+low)/2;
			
		}
		
		if(low>high) {
			//System.out.println(key+" Not Found in Array");
		}
		
		hm.put(key,iteration);
		
		
		
		}
		
		Collection iterations = hm.values();
		ArrayList ls=new ArrayList(iterations);
		int iteration_counts=0;
		for(int i=0;i<ls.size();i++) {
			iteration_counts+=(int)ls.get(i);
		}
		
		System.out.println("iteration_counts: "+iteration_counts);
		
		
		
		System.out.println(hm);
		
		
	}

}
