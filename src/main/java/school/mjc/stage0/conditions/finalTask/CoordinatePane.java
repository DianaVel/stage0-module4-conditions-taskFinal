package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String pos ;
        if(x == 0 & y == 0){
            pos = "zero";
        } else if (x >0 && y > 0) {
            pos = "first";
        } else if (x < 0 && y > 0) {
            pos = "second";
        }else if (x <0 && y < 0){
            pos = "third";
        } else {
            pos ="fourth";
        }
        System.out.println(pos);
    }
}
