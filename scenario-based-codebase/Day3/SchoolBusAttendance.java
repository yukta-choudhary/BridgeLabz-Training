/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;

public class SchoolBusAttendance{
	
	public static void main(String[] args){
	
		//Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Create array of strings for student names
		String[] studentNames = {"Dustin", "Eleven", "Jonathan", "Lucas", "Max", "Mike", "Nancy",  "Robin", "Steve", "Will"}; 
		
		//Create variables for present and absent counter
		int presentCount = 0, absentCount = 0;
		for(String i: studentNames){
			
			//Create a variable to take the attendance input from the user
			System.out.println(i + " Present or Absent? ");
			String attendance = input.nextLine().toLowerCase();
			
			//Check if student present or absent. If yes update the counter
			if(attendance.equals("present")){
				presentCount++;
			}else if(attendance.equals("absent")){
				absentCount++;
			}
		}
		
		//Display the number of present and absent students
		System.out.println("Total Number of present students are " + presentCount);
		System.out.println("Total Number of absent students are " + absentCount);
		input.close();
		
	}
}