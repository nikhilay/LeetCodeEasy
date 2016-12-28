/**
 * Created by Nikhil on 12/28/16.
 */

import java.util.HashMap;

/**
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such
 * that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all
 * in the range [-10000, 10000] (inclusive).
 */
public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        if (points == null || points.length == 0 || points[0].length == 0) return 0;
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if(i==j) continue;
                int d = getDistance(points[i],points[j]);
                if(!map.containsKey(d)){
                    map.put(d,0);
                }
                map.put(d,map.get(d)+1);
            }
            for(int d:map.keySet()){
                int size = map.get(d);
                res += size*(size-1);
            }
        }
        return res;
    }
    private int getDistance(int[] point1,int[] point2){
        int x = point1[0] -point2[0];
        int y = point1[1] - point2[1];
        return x*x +y*y;
    }
}
