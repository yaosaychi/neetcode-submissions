class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int [] arr = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            int count = 0;
            for(int j = 1 + i; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i] ){
                    count++;
                    arr[i] = count;
                    count = 0;
                    break;
                } else {
                    count++;
                }
                if (j == temperatures.length - 1) count = 0;
            }
        }

        return arr;
    }
}