
public class JavaWeek2Lab1 {

	public static void main(String[] args) {
		// create a variable named age and assign it a value of 14
		int age = 14;
		
		//print the boolean expression age >=16 to the console and not the results.
		//change the value of age to 18 and run again
		age =18;
		System.out.println(age >= 16);
		
		//using a conditional, print "You can drive" if age is greater than or equal to 16
		//add "You cannot drive" otherwise
		// change the value of age and rerun to see the result
		
		boolean haslicense = true;
		if ((age >= 16)&& haslicense) {
			System.out.println("You can drive");
		}
		else { 
			System.out.println("You cannot drive");
		}
		
		//add a new variable called hasLiscence before the conditional
		//change the boolean expression in the conditional to additionally include the need for hasLiscence to be true
		//try changing the values of age and hasLicense and note the different results
		
		//create two new variables - costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		//or if thirstLevel is greater that 6 and prints "No Thanks" otherwise
		// change the values and note the different results
		
		double costOfMilk = 5.50;
		int thirstLevel = 8;
		
		if (costOfMilk < 2.50 || thirstLevel > 6){
			System.out.println("Milk Please");
		}
		else {
			System.out.println("No Thanks");
			
		}
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions
		//if there are  0 cookies remaining, print "Sad face"
		//if there are less than 2 cookies, print "yes!"
		//if there are less than 5 cookies, print "Whooohooo!"
		//if there are 5 or more cookies, print "Jackpot!"
		
		int numberOfCookies = 80;
		int numberOfChildren = 10;
		
		int cookiesRemaining = numberOfCookies%numberOfChildren;
		
		if (cookiesRemaining == 0){
			System.out.println("Sad Face");
		} else if (cookiesRemaining < 2 ) {
			System.out.println("Yes!");
		} else if (cookiesRemaining < 5 ) {
			System.out.println("WhoooHooo");
		} else {
			System.out.println("Jackpot!");
		}
		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
		//"SILVER" is .10, "GOLD" is .15, and "PLATIMUN" is .25
		
		String loyaltyMemberStatus = "PLATINUM";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER": 
				loyaltyMemberDiscount = .10;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;
		}
		//create a variable called billTotal and assign a value
		//create a variable called adjustedTotal and assign it the billTotal minus the LMD % of the billtotal
		//if the adjustedbillTotal is greater than 500 upgrade the loyalitymember status from silver to gold, or from gold to Platinum
		
		double billTotal = 4534.45;
		double adjustedTotal = (billTotal - (billTotal * loyaltyMemberDiscount));
		
		if (adjustedTotal > 500.00)
			switch (loyaltyMemberStatus) {
				case "SILVER":
					loyaltyMemberStatus = "GOLD";
					break;
				case "GOLD":
					loyaltyMemberStatus = "PLATNUM";
					break;
			}
		System.out.println(adjustedTotal);
		System.out.println(loyaltyMemberStatus);
		
		//create two variables, username and password
		//create a conditional that prints "login successful" if the username is "tommy123" and the password is "12345"
		//otherwise print "access denied.
		
		String username = "tommy123";
		String password = "12345";
		
		if (username == "tommy123" && password == "12345") {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		
		//write a for loop that prints each number from 0 to 9
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		//write a for loop that prints each number from 10 to 0 backwards
		
		
		//write aa loop that prints every other number from 0 to 100
		
		//write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if the number is odd.
	}
}

