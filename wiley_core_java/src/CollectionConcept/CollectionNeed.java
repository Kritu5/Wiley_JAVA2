package CollectionConcept;
class Student{}
class Book{}

public class CollectionNeed {
 public static void main(String[] args) {
	 //limitation of array
	 //fixed size
	 //Arrays can hold only homogeneous data elements 
	 Student[] students = new Student[10];
	 students[0] = new Student();
	 students[1] = new Student();
	 Object[] objects = new Object[10];
	 objects[0]= new Student();
	 objects[1]= new Book();
}
}
