package BaiTH1;

class Student {
    //danh sach bien
	private String name;
	private int id;
	private String group;
	private String email;
	
	//set and get Name
	public void setName(String n) {
		   this.name =  n;
	}
	    public String getName() {
	    	  return name;
	    }
	//set and get ID    
	public void setID(int n) {
		   this.id = n;
	}
		public int getID() {
			   return id;
        }	
	//set and get group
	public void setGroup(String n) {
	       this.group = n;
	}
		 public String getGroup() {
			 	return group;
		 }
	//set and get Email
	public void setEmail(String n) {
	       this.email = n;
	}
			public String getEmail() {
				return email;
			}
	//get Info method
	public String getInfo() {
		 String stu_Inf = name + " - " + id + " - " + group + " - " + email;
		 return stu_Inf;
	}
	
	//initiate with no arg 
	public void student() {
		   this.name  = "Student";
		   this.id    = 000;
		   this.group = "K62CB";
		   this.email = "uet@vnu.edu.vn";   
	}
	
	//initiate with args
	public void Student_with_args(String name ,int id ,String email) {
		   this.name =  name;
		   this.id   = id;
		   this.email = email;
		   this.group = "K62CB";
	}
	public void copy_Student(Student s) {
		   this.name  = s.getName();
		   this.id    = s.getID();
		   this.group = s.getGroup();
		   this.email = s.getEmail();
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nothing here :)

	}

}
