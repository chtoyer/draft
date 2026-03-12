class Line implements Cloneable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line other = (Line) obj;
        return start.equals(other.start) && end.equals(other.end);
    }
    @Override
    public Line clone() {
        try {
            Line clonedLine = (Line) super.clone();
            clonedLine.start = this.start.clone();
            clonedLine.end = this.end.clone();
            return clonedLine;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString() {
        return "Линия [" + start + " -> " + end + "]";
    }
}
class LineMain {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1,2), new Point(3,4));
        Line l2 = l1.clone();
        System.out.println("Оригинал: " + l1);
        System.out.println("Клон: " + l2);

        l1.start.x = 100;
        System.out.println("После изменения оригинала:");
        System.out.println("L1: " + l1);
        System.out.println("L2: " + l2 + " (не изменилась)");
    }
}