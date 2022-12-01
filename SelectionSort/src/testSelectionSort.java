/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 12;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 12;

        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
        /** Test data contains negative values only **/
    }
    
    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 11;
        arr[2] = -7;
        arr[3] = 0;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -7;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 11;

        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
        
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -2;
        arr[2] = 7;
        arr[3] = 7;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -2;
        Sortedarr[2] = -2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 7;

        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
        
        /** Test data contains duplicates **/
    }


}
