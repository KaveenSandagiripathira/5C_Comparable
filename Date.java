/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

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
	
	public int compareTo( Object otherObj){
		Date otherDate = (Date) otherObj;
		int dayCounter0 = y * 365 + m * 30 + d;
		int dayCounter1 = otherDate.y * 365 + otherDate.m * 30 + otherDate.d;
		if (dayCounter0 == dayCounter1)
			return 0;
		else if (dayCounter0 > dayCounter1)
			return 1;
		else
			return -1;
		}

}