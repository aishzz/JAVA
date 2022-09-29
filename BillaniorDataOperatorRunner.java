class  BillaniorDataOperatorRunner{
	public static void main(String[] money)
	{
		System.out.println("Money MONEY");
		BillaniorDataOperator.save("Elon Musk");
		BillaniorDataOperator.save("Goutham Adani");
		BillaniorDataOperator.save("Amazon CEO");
		BillaniorDataOperator.save("BillGates");
		BillaniorDataOperator.save("Aishwarya");
		BillaniorDataOperator.save("Krishna");
		BillaniorDataOperator.save("Chiru");
		BillaniorDataOperator.update("Nandin", "Reddy");
		BillaniorDataOperator.findBillanior("Aishwarya");
		BillaniorDataOperator.displayDetails();
	}
}