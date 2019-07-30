package assignment_16;

public class MinimumLimitException extends Exception {

	  private static final long serialVersionUID = 1L;

	  @Override
	  public String toString() {
	    return "Minimum Balance Limit is reached";
	  }

	  @Override
	  public void printStackTrace() {
	    super.printStackTrace();
	    System.out.println("Minimum Balance Limit is reached");
	  }
	}
