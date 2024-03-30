class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    System.out.println("Indices: " + i + ", " + j);
                    // Returning an array with indices i and j
                    return new int[]{i, j};
                }
            }
        }
        // If no solution found
        System.out.println("No solution found.");
        // Returning an empty array as no solution is found
        return new int[0];
        }
        
    }
