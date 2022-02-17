package org.excel_FileHandeling;  //[Date :- 07-02-22]

import java.util.*;

public class Assignment2 { 
	public static void main(String[] args){

		Scanner in=new Scanner(System .in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int k=in.nextInt();
		int ans=1;
		for(int i=k-1;i<n-1;i++){
			if(arr[i+1]>arr[i]){
				ans++;
			}
		}

		System.out.println(ans);
	}

}


