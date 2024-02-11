class Point implements GridQuadrant, CompareQuadrant {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    Quadrant getQuadrant() {
        if (x > 0 && y > 0) {
            return Quadrant.Q1;
        }
        if (x > 0 && y < 0) {
            return Quadrant.Q2;
        }
        if (x < 0 && y > 0) {
            return Quadrant.Q3;
        }
        if (x < 0 && y < 0) {
            return Quadrant.Q4;
        } else {
            return null;
        }
    }

    boolean isInSameQuadrant(Point point) {
        double newX = point.getX();
        double newY = point.getY();
        if (x > 0 && y > 0 && newX > 0 && newY > 0) {
            return true;
        }
        if (x > 0 && y < 0 && newX > 0 && newY < 0) {
            return true;
        }
        if (x < 0 && y > 0 && newX < 0 && n
