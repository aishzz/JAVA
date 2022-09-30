class Conversion {  
  
static void conversion(float hours)  
{  
float minutes, seconds;  
  
    minutes = hours * 60;  
    seconds = hours * 3600;  
  
    System.out.println("There are " + minutes + " minutes in " + hours + " hours");  
    System.out.println("There are " + seconds + " seconds in " + hours + " hours");  
	}
	  public static void main (String[] args) {  
    float hours;  
    System.out.println("Enter the value of hours: ");  
    Scanner sc = new Scanner(System.in);  
    hours = sc.nextFloat();  
    conversion(hours);  
    }  