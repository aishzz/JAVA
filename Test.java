1. In java byte code is platform independent i.e it is written once and run anywhere
 byte code makes java as platform independent ,every electronic device has its own jvm 
 ,when the program is written it is compiled using compiler
 and compiler converts .java to .class and class loader loads the data and verifys the data and executes the program
 jvm understands the byte code

2. Primitive data types;  types of primitive data types are  ,shot ,int, long, float, double,char,boolean,byte
                default vales of byte, short, int, long =0
				double,float=0.0
				char= /n
				boolean= null


 Non Primitive data types :we have string, array and n number of non primitive types
                           default vales of non primitives are NULL
						   every class type is non primitive
						 
						 
3. CLASS : class is the blueprint of operation ,is declared with the uppercase 
declaration: class Name{
            public static void main(String[] args){
			system.out.println("hellow world");
			}
}



4. class ToatalMarks
{
 public static void main(String[] args)
 {
 int marks1=63;
 int marks2=86;
 ToatalMarks= marks1 +marks2;
 system.out.println("The total percentage+" marks1"+marks2");
 }
}




5.import java.util.Arrays;   
public class SortArrayExample1  
{   
public static void main(String[] args)   
{     
int [] array = new int [] {34,78,90,53,34,11,53,15,78,91,8,4,67,11};
//invoking sort() method of the Arrays class  
Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order: ");  
//prints array using the for loop  
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
















