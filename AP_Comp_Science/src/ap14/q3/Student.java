package ap14.q3;

import java.util.List;

public class Student {
	
	private Student [][] seats;
	
	public void SeatingChart(List<Student> studentList, int rows, int cols){
		seats=new Student[rows][cols];
		int studentIndex=0;
		for (int col = 0; col < cols; col++){
			for (int row = 0; row < rows; row++){
				if (studentIndex < studentList.size()){
					seats[row][col] = studentList.get(studentIndex);
					studentIndex++;
				}
			}
		}
	}
	
	public void SeatingChart2(List<Student> studentList, int rows, int cols){
		seats=new Student[rows][cols];
		int row=0;
		int col=0;
		for (Student student : studentList){
			seats[row][col]=student;
			row++;
			if (row==rows){
				row=0;
				col++;
			}
		}
	}
	
	public int removeAbsentStudents(int allowedAbsences){
		int count = 0;
		for (int row=0; row < seats.length; row++){
			for (int col=0; col < seats[0].length; col++){
				if (seats[row][col] != null &&
					seats[row][col].getAbsenceCount() > allowedAbsences){
					seats[row][col]=null;
					count++;
				}
			}
		}
		return count;
	}

	private int getAbsenceCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
