public class HelloWorld {
   public static void main(String[] args){
    int number1;
	int number2;
	int addition;
	
	int base,exp,res;
	base =5;
	exp = 4;
	res = 1;
	for (res=1; exp > 0; exp--) res *=base;
	
	
	
	 number1=58;
	 number2=69;
	 
	 addition=addTwoNumbers(number1, number2);
	 System.out.println("hellow world form adrian iza");
	 
	 System.out.println ("addition of" +number1 + " + " + number2 +"is -->" +addition);
	 System.out.println ("the result of the power of "+base + " raised to the 4 " +"is-->" +res);
   
	 }
	 static int addTwoNumbers(int addend1, int addend2) {
		 int total;
		 total=addend1 + addend2;
		 return total;
	 }
	 
}