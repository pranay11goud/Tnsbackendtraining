package mypack;

class Daytype{
	public static void main(String[]args) {
		String day = "friday";
		switch(day) {
		case"monday":
		case"tuesday":
		System.out.println("Early Days");
		break;
		case"wednesday":
		case"thrusday":
		System.out.println("Mid days");
		break;
		case"friday":
		System.out.println("End week");
		break;
		default:
			System.out.println(" weekend");
			break;
			
			
		}
	}
}
