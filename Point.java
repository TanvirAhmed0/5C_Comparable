/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        if ( otherObj instanceof Point) {
            Point otherPoint = (Point) otherObj;
            return Double.compare( distance(), otherPoint.distance()); // temp: all Points are One
        }
        else {
            return -100000000;
        }
    }
    
    /*
    Finds the distance from the point to the origin.
    */
    public double distance() {
        return Math.sqrt( Math.pow( xcor, 2) + Math.pow( ycor, 2));
    }
    
    
    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}