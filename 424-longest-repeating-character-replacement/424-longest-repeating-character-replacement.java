class Solution {
    public int characterReplacement(String s, int k) {
        int length = s.length();
        if(length == 0) return 0;

        char[] charArray = s.toCharArray(); //在java当中遍历的时候要用到charAt()，所以先赋一个charArray
        int[] freq = new int[26]; //string里面每个char出现的次数，只出现大写，所以26
        int maxCount = 0; 

        int left = 0;
        int right = 0;
        int res = 0;
        // [left,right)内最多替换k个letter的sub string

        while(right < length){ //while loop 终止的条件是right抵达右壁
            freq[charArray[right] - 'A']++; //freq有26个0，在那个position+1
            maxCount = Math.max(maxCount, freq[charArray[right] - 'A']); 
            right++; //右边界向右移动

            if(right - left > maxCount + k){
                freq[charArray[left] - 'A']--;
                left++; // left向左移动一格
            }
            res = Math.max(res, right - left);

        }
        return res;
    }
}
