public class Student{

	

		private int rollno;
		private String name;
		private int numOfSub;
		private int [] marks;

		public Student(){

			rollno = 1;
			//name = "ABC";
			name = new String("ABC");
			numOfSub = 6;
			//marks = new int[6];
		
		}

		public Student(int rollno,String name,int numOfSub, int [] marks){

			this.rollno = rollno;
			
			this.name = new String(name);
			this.numOfSub = numOfSub;
			this.marks = new int[marks.length];

			for(int i=0; i<marks.length; i++){

				this.marks[i]= marks[i];
			}
		
		}

		public void display(){

			System.out.println("Roll No : " + rollno);
			System.out.println("Name : " + name);
			System.out.println("Number of Subject : " + numOfSub);
			System.out.println(" Marks of Student : " );
			for(int i=0; i<marks.length; i++){

				System.out.println(marks[i]);
			}


			System.out.println("Percentage : ");
			this.calPercentage();

		}

		public void calPercentage(){
			int sum=0;
			float per;
			for(int i=0; i<marks.length;i++){
			
				sum += marks[i];

			}
			per = (sum * 100)/(numOfSub*100);
			System.out.println(per);
			

		}




}