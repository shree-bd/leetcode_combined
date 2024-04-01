class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();       
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int sum=0;
        int n=s.length();

        for(int i =0;i<n;i++){

            if(i<n-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                sum = sum + m.get(s.charAt(i+1)) - m.get(s.charAt(i));
                i++;
            }

            else{
                sum = sum + m.get(s.charAt(i));
            }

        }    

return sum;
    }
}
