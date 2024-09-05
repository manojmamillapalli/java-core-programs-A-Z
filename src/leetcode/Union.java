package leetcode;
import java.util.*;
public class Union {

	public static void main(String[] args) {
		
int[] arr1= {1,2,3,4,5};
int[] arr2= {1,2,3};
System.out.println(doUnion(arr1,arr2));
	}
	public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        List<Integer> list=new ArrayList<>();
        int l1=arr1.length;
        int l2=arr2.length;
        if(l1>l2)
        {
        for(int i=0;i<l1;i++)
        {
            list.add(arr1[i]);
        }
        for(int j=0;j<l2;j++)
        {
            if(list.contains(arr2[j]))
            {
                continue;
            }
            else
            list.add(arr2[j]);
        }
        }
        else
        {
           for(int i=0;i<l2;i++)
        {
            list.add(arr1[i]);
        } 
         for(int j=0;j<l1;j++)
        {
            if(list.contains(arr1[j]))
            {
                continue;
            }
            else
            list.add(arr1[j]);
        }
        }
        return list.size();
        
    }

}
