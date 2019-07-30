package assignment_16;

public class BeyondLimitException extends Exception {

	  private static final long serialVersionUID = 1L;

	  //@Override
	  public void printStackTrace() {
	    super.printStackTrace();
	    System.out.println("Maximum Balance Limit is reached");
	  }

	 // @Override
	  public String toString() {
	    return "Maximum Balance Limit is reached";
	  }
	}