package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.
 * Note: Using the library sort function is not allowed.
 *
 * 1 <= N <= 1000000
 * 0 <= A[i] <= 2
 *
 *
 */
public class SortByColor {

    public ArrayList<Integer> sortColors1(ArrayList<Integer> A) {
        int redPosition = 0;
        int  bluePosition= A.size()-1;

        for(int i=0;i<=bluePosition;){
            if(A.get(i) == 0){
                int temp = A.get(redPosition);
                A.set(redPosition, 0);
                A.set(i, temp);
                redPosition++;
                i++;
            }else if(A.get(i) == 2){
                int temp = A.get(bluePosition);
                A.set(bluePosition, 2);
                A.set(i, temp);
                bluePosition--;
            }else{
                i++;
            }
        }


        return A;
    }

    public ArrayList<Integer> sortColors2(ArrayList<Integer> A) {
        int redCount = 0;
        int whiteCount = 0;

        for(int i=0;i<A.size();i++){
            if(A.get(i) == 0)
                redCount++;
            else if(A.get(i) == 1)
                whiteCount++;
        }

        for(int i=0;i<redCount;i++)
            A.set(i, 0);

        for(int i=redCount;i<redCount+whiteCount;i++){
            A.set(i, 1);
        }

        for(int i=redCount+whiteCount;i<A.size();i++){
            A.set(i, 2);
        }

        return A;
    }

    public ArrayList<Integer> sortColors3(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2){
                if(i1 < i2)
                    return -1;
                else if(i1 == i2)
                    return 0;
                else
                    return 1;
            }
        });

        return A;
    }


}
