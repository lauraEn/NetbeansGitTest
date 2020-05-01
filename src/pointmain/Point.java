package pointmain;

public class Point {
    //Klassenfelder
    public static int pointCounter = 0;
    
    //OBjektbezogene Felder
    private int x;
    private int y;
    
    //Konstruktoren
    public Point() {
        this(0, 0); // ruft Point(0, 0) Konstruktor auf
        pointCounter++;     //neues Objekt erzeugt -> erhöhe Zähler
    }
     
    public Point(int x, int y) {
        setLocation(x, y);
        pointCounter++;     //neues Objekt erzeugt -> erhöhe Zähler
    }
    
    //Klassenmethoden
    public static void resetPointCounter(){
        pointCounter = 0;
    }
    
    //Objektbezogene Methoden
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
       
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
      
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
}

