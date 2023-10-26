import java.util.*;
class Solution {
    public int solution(int[] numbers) {
       Arrays.sort(numbers);
        int a =Math.max(numbers[0]*numbers[1], numbers[numbers.length-1]*numbers[numbers.length-2]);
      return a;
    }
}