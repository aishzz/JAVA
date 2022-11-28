package com.xworkz.programs;

public class StringMethods2 {
	
		public static void main(String[] args) {
			String trippleRide = "Kantara was released on 30 September 2022 and received acclaim from critics, who praised the cast performances (particularly those of Shetty and Kishore),"
			+ "direction, writing, production design, cinematography, proper showcasing of the Bhoota Kola, action sequences, editing, soundtrack, and musical score.";
			System.out.println(trippleRide.length());
			System.out.println("(1)Split by ,");
			System.out.println("____________________________________________________________________");
			String[] splitstament = trippleRide.split(",");
			for (int i = 0; i < splitstament.length; i++) {
				System.out.println(splitstament[i]);
			}
			System.out.println(splitstament.length);
			System.out.println(System.lineSeparator());
			System.out.println("(2)Split all by space ");
			System.out.println("____________________________________________________________________");
			String[] splitstament1 = trippleRide.split(" ");
			
			for (int i = 0; i < splitstament1.length; i++) {
				System.out.println(splitstament1[i]);
			}
			System.out.println(splitstament1.length);
			System.out.println(System.lineSeparator());
			System.out.println("(3)Upper case");
			System.out.println("____________________________________________________________________");
			String upper = trippleRide.toUpperCase();
			System.out.println(upper);
			System.out.println(System.lineSeparator());
			System.out.println("(4)Lower case");
			System.out.println("____________________________________________________________________");
			String lower = trippleRide.toLowerCase();
			System.out.println(lower);
			System.out.println(System.lineSeparator());
			System.out.println("(5) Convert above string to char [] ");
			System.out.println("____________________________________________________________________");
			char[] array = trippleRide.toCharArray();
			
			for (int n = 0; n < array.length; n++) {
				System.out.print(array[n]);
			}
			System.out.println(System.lineSeparator());
			System.out.println("(6)Reverse above string by using for loop ");
			System.out.println("____________________________________________________________________");
			for (int i = array.length - 1; i >= 0; i--) {
				System.out.print(array[i]);
			}
			System.out.println(System.lineSeparator());
			System.out.println("(6)Reverse above string by using in build method ");
			System.out.println("____________________________________________________________________");
			StringBuilder set = new StringBuilder(trippleRide);
			set.reverse();
			String get = set.toString();
			System.out.println(get);
			System.out.println(System.lineSeparator());
			System.out.println("(7)Print all duplicate Characters ");
			System.out.println("____________________________________________________________________");
			char[] duplicate = lower.toCharArray();
			int[] dupli = new int[duplicate.length];
			for (int i = 0; i < duplicate.length; i++) {
				dupli[i] = 1;
				for (int j = i + 1; j < duplicate.length; j++) {
					if (duplicate[i] == duplicate[j]) {
						dupli[i]++;
						duplicate[j] = 0;
					}
				}
			}
			for (int i = 0; i < dupli.length; i++) {
				if (duplicate[i] != ' ' && duplicate[i] != 0) {
					System.out.println(duplicate[i] + "-" + dupli[i]);
				}
			}
			System.out.println(duplicate.length);
			System.out.println(System.lineSeparator());
			System.out.println("(8).Write logic to find no of 'R' in above sentence");
			System.out.println("____________________________________________________________________");
			char[] frequency = lower.toCharArray();
			int[] freq = new int[frequency.length];
			for (int i = 0; i < frequency.length; i++) {
				freq[i] = 1;
				for (int j = i + 1; j < frequency.length; j++) {
					if (frequency[i] == frequency[j]) {
						freq[i]++;
						frequency[j] = 0;
					}
				}
			}
			for (int i = 0; i < freq.length; i++) {
				if (frequency[i] != ' ' && frequency[i] != 0 && frequency[i] == 'r') {
					System.out.println(frequency[i] + "-" + freq[i]);
				}
			}
			System.out.println(System.lineSeparator());
			System.out.println("(9)Find all no of digits in above string ");
			System.out.println("____________________________________________________________________");
			int count = 0;
			for (int i = 0; i < trippleRide.length(); i++) {
				if (Character.isDigit(trippleRide.charAt(i)))
					count++;
			}
			System.out.println("Total no of digits in string:" + count);
			System.out.println(System.lineSeparator());
			System.out.println("(9)Find all digits in above string ");
			System.out.println("____________________________________________________________________");
			for (char dig : trippleRide.toCharArray()) {
				if (Character.isDigit(dig)) {
					System.out.println("The digit found is " + dig);
				}
			}
			System.out.println(System.lineSeparator());
			System.out.println("(10)find Palindrome word in above string ");
			System.out.println("____________________________________________________________________");
			String[] palindrome = trippleRide.split(" ");
			for (int i = 0; i < palindrome.length; i++) {
				String[] palindrome1 = palindrome[i].split(",");
				for (int j = 0; j < palindrome1.length; j++) {
					// System.out.println(palindrome1[j]);
					// if(palindrome[i]==palindrome1[j]) {
					StringBuilder str1 = new StringBuilder(palindrome1[j]);
					str1.reverse();
					String rev = str1.toString();
					if (str1.equals(rev.charAt(i))) {
						System.out.println(rev + ":: is a palindrom");
					} else {
						System.out.println(rev + ":: is not a palindrom");
					}
				}
			}
			System.out.println(palindrome.length);
		}

}
