class IdentityRunner{
	public static void main(String[] name){
		System.out.println("Executing firstName Method");
		String value="aish";
		Identity.println(value);
			
		String value1="lokima";
		Identity.printName(value1);
		
		String value2="chiru";
		Identity.printName("value2");
		
		System.out.println("Executing NameAndEmail");
		String Name1="priya";
		String Email1="priyakp32@gmail.com";
		
		Identity.printNameAndEmail("Name1");
		Identity.printNameAndEmail("Email1");
		
		
		
		
		
	}
	
	
}