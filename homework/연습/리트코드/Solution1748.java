package homework.연습.리트코드;

import java.util.HashMap;
import java.util.Map;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int oldValue = map.get(num);
                map.put(num, 1); // 첫 발견
            }
        }
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                sum += entry.getKey();
            }
        }

        System.out.println(map);

        return sum;
    }
}
