class BillaniorDataOperator{
	static String[]billaniorNames={null,null,null,null,null,null,null};
	static int position=0;
	static void save(String Billanior)
	{
		System.out.println("lets count dollers insted of stars");
		if(position>=billaniorNames.length){
			System.out.println("System size exceede");
		return;
		}
		if(billaniorNames!=null && Billanior!=null)
		{
			System.out.println("Billaniors name,wi;; check in array");
			billaniorNames[position]=Billanior;
			position++;
			System.out.println("saved billanior:"+billaniorNames+" at position:"+position);
			
		}
	}
	static void displayDetails()
	{
		for(int index=0;index<billaniorNames.length;index++)
		{
			String ref=billaniorNames[index];
			System.out.println(ref);
		}
	}
	static boolean findBillanior(String name)
	{
		System.out.println("it is valid name");
		for(int index=0;index<billaniorNames.length;index++)
		{
			String ref=billaniorNames[index];
			if(ref==name)
			{
				System.out.println("Shrimantha is"+ref);
				return true;
			}
			else
			{
				System.out.println("name is not available");
			}
		}
		return false;
	}
	static String update(String oldName,String newName)
	{
		System.out.println("list start aytu...");
		if(oldName!=null && newName.length()>5)
		{
			System.out.println("billaniorname is valid");
			for(int money=0;money<billaniorNames.length;money++)
			{
				String data=billaniorNames[money];
				if(oldName==data)
				{
					System.out.println("name updated"+data+"with");
					billaniorNames[money]=newName;
					return newName;
				}
			}
			return false;
		}
		static String update(String oldName,String newName)
		{
			System.out.println("list start aytu...");
		if(oldName!=null && newName!=null)
		{
			if(oldName.length()<5 && newName.length()<5){
				System.out.println("billaniorname is valid");
			for(int money=0;money<billaniorNames.length;money++)
			{
				String data=billaniorNames[money];
				if(oldName==data)
				{
					System.out.println("name updated"+data+"with");
					billaniorNames[money]=newName;
					return newName;
						}
			}
		}
}
else{
	System.out.println("billaniordata is valid,cannot update");
}
return null;
		}
	