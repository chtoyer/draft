class Point implements Cloneable {
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }
    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = p1.clone();
        Point p3 = new Point(10, 20);

        System.out.println("Точка 1: " + p1);
        System.out.println("Клон (Точка 2): " + p2);

        System.out.println("p1 equals p2 (клон): " + p1.equals(p2));
        System.out.println("p1 equals p3 (новая): " + p1.equals(p3));
        System.out.println("p1 == p2 (ссылки): " + (p1 == p2));
    }
}