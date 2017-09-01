package readinglist;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

import org.aspectj.weaver.ast.And;

import com.fasterxml.jackson.databind.util.LinkedNode;

public class Test {

	public static void main(String[] args) {
		bubbleSort(new int[]{5,7,3,1,9,6,23,10});
	}
	
	public static void bubbleSort(int[] arr) {
		if(arr == null || arr.length == 0)
            return ;
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length; i >0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
//					Collections.sort(list);
					System.out.println(Arrays.toString(arr));
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
