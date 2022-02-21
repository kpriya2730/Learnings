package sorting;

import java.util.*;

/**
 * Sort an array in ASC order by the number of factors. If the number of factors is same, sort by value.
 *
 * Ex: 9,3,10,6,4
 * O/P: [3, 4, 9, 6, 10]
 *
 */

public class SortByFactors {

    private int countFactors(int num){
        int count = 0;
        int i=1;
        while(i*i <= num){
            if(i*i == num)
                count++;
            else if(num%i == 0)
                count = count+2;
            i++;
        }
        return count;
    }

    public void solve(List<Integer> A){
        Collections.sort(A,new Comparator<Integer>(){

            @Override
            public int compare(Integer num1, Integer num2) {
                int factorCount1 = countFactors(num1);
                int factorCount2 = countFactors(num2);

                if(factorCount1 < factorCount2)
                    return -1;
                else if(factorCount1 == factorCount2)
                    if(num1 < num2)
                        return -1;
                return 1;
            }
        });
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6, 2, 3, 1, 7, 5, 9));
        for(int n : list){
            System.out.print(n+" ");
        }
        System.out.println();
        SortByFactors sortByFactors = new SortByFactors();
        sortByFactors.solve(list);
        for(int n : list){
            System.out.print(n+" ");
        }
    }

}
