/**
  Represent a date
 */
public class Date{
    private int y,m,d;
    
    public int compareTo( Object otherObj) {
        if ( otherObj instanceof Date) {
            Date otherDate = (Date) otherObj;
        
            if ( y < otherDate.y) return -1;
            else if ( y > otherDate.y) return 1;
            else if ( m < otherDate.m) return -1;
            else if ( m > otherDate.m) return 1;
            else if ( d < otherDate.d) return -1;
            else if ( d > otherDate.d) return 1;
            else return 0;
        }
        else return -10000000;

    }

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}