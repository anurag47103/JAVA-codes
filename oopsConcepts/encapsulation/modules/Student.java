package oopsConcepts.encapsulation.modules;

public class Student {

			private static int studentVar = 4;
			
			public int getStudentVar() {
				return studentVar;
			}

			public void setStudentVar(int studentVar) {
				if(studentVar<20) {
					System.out.println("you are too young kid");
				}
				else {
					this.studentVar = studentVar;
				}
			}

			
			
			
			public void std() {
				System.out.println("Student public");
			     String u = "hey";
			}
			
			private void std2() {
				System.out.println("Student private");
			}
			
			void std3() {
				System.out.println("Student default");
			}
}
