/**
 * Created by Nikhil on 12/28/16.
 */

/**
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
 * and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes"
 * (water inside that isn't connected to the water around the island). One cell is a square with side length 1.
 * The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 */

/**
 * Inspired from
 * https://discuss.leetcode.com/topic/68786/clear-and-easy-java-solution/2
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int islands = 0;
        int neighbours = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    islands++;
                    if(i<grid.length-1 && grid[i+1][j]==1) neighbours++;
                    if(j<grid[0].length-1&& grid[i][j+1]==1) neighbours++;
                }
            }
        }
        return 4*islands - 2*neighbours;
    }
}
