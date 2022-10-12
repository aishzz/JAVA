package DistrictCollector.xworkz.DistrictCollector.xworkz.copy.DistrictCollector.xworkz.copy.boot;

public class DistrictCollector {
	private String name;
	private String district;
	private int age;
	private int batchNo;

	public static void main(String[] args) {
		DistrictCollector dc=new DistrictCollector();
		dc.name="Dr. Krishna";
		dc.age=30;
		dc.district="Mysore";
		dc.batchNo=3;
		System.out.println(dc.name);
		System.out.println(dc.age);
		System.out.println(dc.district);
		System.out.println(dc.batchNo);
	}
}

