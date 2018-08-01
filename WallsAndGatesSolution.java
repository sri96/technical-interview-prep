import java.util.*;

public class WallsAndGatesSolution {

    private static final int[] Rooms = {0, 0, 1, -1};
    private static final int[] Cells = {1, -1, 0, 0};

    private class Cell{
        int rooms, cells;
        Cell(int rooms, int cells){
            this.rooms = rooms;
            this.cells = cells;
        }
    }

    public static void main(String[] args) throws Exception{
        int[][] A = {{Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}};
                new WallsAndGatesSolution().wallsAndGates(A); 
    }

    public void wallsAndGates(int[][] rooms) {
        Queue<Cell> queue = new ArrayDeque<>();
        for(int i = 0; i < rooms.length; i ++){
            for(int j = 0; j < rooms[0].length; j ++){
                if(rooms[i][j] == 0){ //treat each co-ordinates of gate as a source
                    Cell cell = new Cell(i, j);
                    queue.offer(cell);
                }
            }
        }
        while(!queue.isEmpty()){
            Cell top = queue.poll();
            for(int loopVariable = 0; loopVariable < 4; loopVariable++){
                int newR = top.rooms + Rooms[loopVariable];
                int newC = top.cells + Cells[loopVariable];
                if(newR >= 0 && newC >= 0 && newR < rooms.length && newC < rooms[0].length){
                    if(rooms[newR][newC] == Integer.MAX_VALUE){
                        rooms[newR][newC] = rooms[top.rooms][top.cells] + 1;
                        queue.offer(new Cell(newR, newC));
                    }
                }
            }
        }
    }
}