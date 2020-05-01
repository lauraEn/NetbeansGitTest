package pointmain;

public class PointMain {
    public static void main(String[] args) {      
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);
        
        System.out.println("Anzahl der Point-Objekte = " + Point.pointCounter);
        
        System.out.println("p1 = " + p1); // ruft p1.toString() auf
        System.out.println("Abstand zu (0,0) = " + p1.distanceFromOrigin());
        System.out.println("p2 = " + p2); // ruft p2.toString() auf
        System.out.println("Abstand zu (0,0) = " + p2.distanceFromOrigin());

        p1.translate(11, 6);
        p2.translate(1, 7);
        
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        
        Point.resetPointCounter();
        System.out.println("Anzah der Point-Objekte = " + Point.pointCounter);
    }
}
