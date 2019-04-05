/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");
        
        // System.out.println( System.lineSeparator()
                          // + "Date comparisons");
						  
		//Same Date
		Date d0 = new Date(1984,12,4);
		reportRelationship( "Same Date", d0, d0, "0");
		
		//Second date is smaller
		reportRelationship( "Smaller Date", d0, new Date(1666,4,22), "1");
		
		//Second date is bigger
		reportRelationship( "Larger Date", d0, new Date(2001,7,22), "-1");
		
		//Incomparable dogs
		// reportRelationship("Doggy",new IncomparableDog(),new IncomparableDog(),"Error");
		// UserOfComparability.java:42: error: incompatible types: IncomparableDog cannot be converted to Comparable
                // reportRelationship("Doggy",new IncomparableDog(),new IncomparableDog(),"Error");
				
		//Different Comparable
		// reportRelationship("Different Comparable",new Point(3,5),new Date(1655,2,2),"Error");
		// Exception in thread "main" java.lang.ClassCastException: class Date cannot be cast to class Point (Date and Point are in unnamed module of loader 'app')
        // at Point.compareTo(Point.java:20)
        // at UserOfComparability.reportRelationship(UserOfComparability.java:66)
        // at UserOfComparability.main(UserOfComparability.java:47)
    }
		


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}