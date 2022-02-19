package arraysandmath;

import java.util.List;

/**
 * You're given a read only array of n integers. Find out if any integer occurs more than n/3 times in the array in linear time and constant additional space.
 * If so, return the integer. If not, return -1.
 *
 * If there are multiple solutions, return any one.
 *
 * Input: [1 2 3 1 1]
 * Output: 1
 * 1 occurs 3 times which is more than 5/3 times.
 */
public class NBy3RepeatNumber {
    public int repeatedNumber(final List<Integer> a) {
        int seenElement1 = 0;
        int seenElement1Count = 0;

        int seenElement2 = 0;
        int seenElement2Count = 0;

        for(int element : a){
            if((seenElement1Count>0 && element!=seenElement1) && (seenElement2Count>0 && element!=seenElement2)){
                seenElement1Count--;
                seenElement2Count--;
            }else if((seenElement1Count==0 && element!=seenElement2) || (seenElement1Count>0 && seenElement1==element)){
                seenElement1 = element;
                seenElement1Count++;
            }else if(seenElement2Count==0 || (seenElement2Count>0 && seenElement2==element)){
                seenElement2 = element;
                seenElement2Count++;
            }
        }

        int count1 = 0;
        int count2 = 0;

        for(int element : a){
            if(element == seenElement1)
                count1++;
            else if(element == seenElement2)
                count2++;
        }

        int N = a.size();

        if(count1 > N/3){
            return seenElement1;
        }else if(count2 > N/3){
            return seenElement2;
        }
        return -1;
    }
}
