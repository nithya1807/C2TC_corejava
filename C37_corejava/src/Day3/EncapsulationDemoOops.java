package Day3;

public class EncapsulationDemoOops { // this is the program for encapsulation where every method wraps under the one class//
 private String name;
 private int age;
 private int runs;
 
 public String getName() {  //we have alreadey have a return//
	 return name;
 }
 public int getAge() {  //we have alreadey have a return//
	 return age;
 }
 public int getRuns() {  //we have alreadey have a return//
	 return runs;
 }
 public void setName(String name) {  //void is the return type method//
	 this.name=name; // this means specify the data or pin point the data// // . is the operator which is use to connect//
	 
 }
 public void setAge(int age) {  
	 this.age=age;
}
 public void setRuns(int runs) {  
	 this.runs=runs;
}
 public String toString() {// coversion of int to string//
	 return "team name [Name ="+name+",Age="+age+",Runs="+runs+"]";
 }

 public static void main(String[] args) {
	EncapsulationDemoOops obj =new EncapsulationDemoOops();
	obj.setName("nithya");
	obj.setAge(21);
	obj.setRuns(69);
	System.out.println(obj);
	
	
}
}