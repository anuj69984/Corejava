package assignment_16;

/**
 * @author anuj6
 * 
 * Demonstrate Exception handling & custom exception class
Take an example of a bank account manager, account manager monitor all the transection of an account
such as amount deposit and withdraw.
 If account balance goes beyond Rs. 20000, then throw an exception let say BeyondLimitException and
amount above 20,000 will be passed and added to fix-deposit.
 If account balance goes below Rs. 500, then throw an exception let say MinimumLimitException.
Create an Account Management class has main () method and following members
Member fields
 name
 age
 accountNumber
 totalAmount
 fixedDepositAmount
Utility method
 depositAmount(float amount) throws BeyondLimitException
 withdrawAmount(float amount) throws MinimumLimitException
 addToFixDeposit(float amount)
You have to create your own classes to handle exceptions.
 */

import java.util.*;

public final class AccountManagement {
	  String name;
	  int age;
	  long accountNumber;
	  float totalAmount = 0;
	  float fixedDepositAmount;

	  public AccountManagement(String name, int age, long accountNumber) {
	    this.name = name;
	    this.age = age;
	    this.accountNumber = accountNumber;
	  }

	  void addToFixDeposit(float amount) {
	    fixedDepositAmount = amount;
	  }

	  void depositAmount(float amount) throws BeyondLimitException {
	    if (totalAmount > 20000) {
	      throw new BeyondLimitException();
	    }
	    totalAmount = totalAmount + amount;
	  }

	  void withdrawAmount(float amount) throws MinimumLimitException {
	    if (totalAmount < 500.0) {
	      throw new MinimumLimitException();
	    }
	    totalAmount = totalAmount - amount;
	  }

	  public static void main(String[] args) {
	    AccountManagement c = new AccountManagement("Anuj ", 21, 1111);
	    c.addToFixDeposit(18000);
	    try {
	      c.depositAmount(800f);
	      c.depositAmount(16000f);
	      c.depositAmount(20000f);
	      c.depositAmount(20000f);
	      c.withdrawAmount(20000f);
	      System.out.println(c.totalAmount);
	    } catch (BeyondLimitException e) {
	      e.printStackTrace();
	   
	    } catch (MinimumLimitException e) {
	      e.printStackTrace();
	    }

	  }

	}