class Solution {
    public int[] twoSum(int[] nums, int target) {

         //creating a hashmap
        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i=0;i<nums.length;i++){

            //get the complment using the target value
            int diff = target - nums[i];

            //search the hashmap for the complement if found, we got our pair

            if(hashmap.containsKey(diff)){

                return new int[]{hashmap.get(diff),i};
            }

            //put the element  in hashmap for subsequent searches

            hashmap.put(nums[i],i);

        }
        return new int[]{}; // No solution found
    }

    }
