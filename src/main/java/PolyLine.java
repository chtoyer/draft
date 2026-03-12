import java.util.Arrays;

class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PolyLine other = (PolyLine) obj;
        return Arrays.equals(this.points, other.points);
    }
    public double length() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double dx = points[i + 1].x - points[i].x;
            double dy = points[i + 1].y - points[i].y;
            sum += Math.sqrt(dx * dx + dy * dy);
        }
        return sum;
    }
}
class PolyLineMain {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(3, 3);

        PolyLine line1 = new PolyLine(p1, p2, p3);
        PolyLine line2 = new PolyLine(new Point(1, 1), new Point(2, 2), new Point(3, 3));
        PolyLine line3 = new PolyLine(p1, p3);

        System.out.println("Линия 1 и Линия 2 одинаковы? " + line1.equals(line2));
        System.out.println("Линия 1 и Линия 3 одинаковы? " + line1.equals(line3));
        System.out.println("Длина первой линии: " + line1.length());
        System.out.println("Это один и тот же объект в памяти? " + (line1 == line2));
    }
}

