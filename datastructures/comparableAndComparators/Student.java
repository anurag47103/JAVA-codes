package datastructures.comparableAndComparators;

public class Student {
		int marks;
		String name;
		
		public Student(int marks , String name) {
			super();
			this.name = name;
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [marks=" + marks + ", name=" + name + "]";
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		public int compareTo(Student obj) {
			if(this.marks - obj.marks == 0) return this.name.compareTo(obj.name); 
			return this.marks - obj.marks;
			 
			
		}
}
