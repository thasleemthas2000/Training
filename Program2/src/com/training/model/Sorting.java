package com.training.model;

import java.util.Arrays;

public class Sorting {
   static void sortString(String str) {
	   char[]arr = str.toCharArray();
	   Arrays.sort(arr);
	   System.out.println(String.valueOf(arr));
   }
}
