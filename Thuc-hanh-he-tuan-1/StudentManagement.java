package BaiTH1;

public class StudentManagement {
    
	String[][] strArr = new String[100][4];
	int i = 0;
	
	//Method compare 2 Student
	public static boolean sameGroup(Student st1 , Student st2) {
		   if(st1.getGroup() ==  st2.getGroup())
			   return true;
		   else
			    return false;
	}
	
	//Method them Student vao Arr
	public void addStudent(Student newStudent) {
		   this.strArr[i][0] = newStudent.getName();
		   this.strArr[i][1] = newStudent.getID(); //Loi cac mang cung kieu thay a
		   this.strArr[i][2] = newStudent.getGroup();
		   this.strArr[i][3] = newStudent.getEmail();
		   i++;
	}
	
	//
	public void removeStudent(String id) {
		
	}
	//
	public String studentsByGroup() {
		  String str1 = "";
		  return str1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 =  new Student();
		st1.setName("Hoang Van Duong");
		st1.setID(18020392);
		st1.setGroup("K63K1");
		st1.setEmail("hduong1207.uet@gmail.com");
		System.out.println(st1.getInfo());
		
		Student st2 = new Student();
		st2.copy_Student(st1);
        System.out.println(st2.getInfo());		
        
	}

}
