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
        if (x < 0 && y > 0 && newX < 0 && newY > 0) {
            return true;
        }
        if (x < 0 && y < 0 && newX < 0 && newY < 0) {
            return true;
        } else {
            return false;
        }
    }
}

enum Quadrant {
    Q1, // x +ve, y +ve
    Q2, // x -ve, y +ve
    Q3, // x -ve, y -ve
    Q4; // x +ve, y -ve
}

interface GridQuadrant {
    Quadrant getQuadrant(); // return which quadrant the point is in
    // if point is at (0,0) return null
}

interface CompareQuadrant {
    boolean isInSameQuadrant(Point point); // true if the given point is
    // in the same quadrant as this point
}

interface PointMaker {
    Point makePoint(double x, double y); // returns a point with given x,y
    int countPointsCreated(); // returns count of points created via factory
}

// TODO: create class PointFactory which implements the interface PointMaker
