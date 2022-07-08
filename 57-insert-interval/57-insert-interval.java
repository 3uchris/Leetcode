class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        int length = intervals.length;
        int i = 0;
        //case 1. intervals on the left are non-overlapping with newInterval
        while(i < length && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        
        //case 2. intervals are overlappin with newInterval
        //counter newInterval[1] >= interval[i][0]
        while(i < length && intervals[i][0] <= newInterval[1]){
            //updates newInterval
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        
        //case 3. intervals on the right that are non-overlapping with the newInterval
        while(i < length && intervals[i][0] > newInterval[1]){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[0][]);
    }
}