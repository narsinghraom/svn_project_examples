package bean;

public class AddEmployeeBean 
{
	 private String EmployeeId;
	 private String EmployeeName;
	 private String Designation;
	 private Long MoblieNo;
	 private String EmailId;
	 private String Address;
	 private String JoiningDate;
	 private String PreviousExperience;
	 public void setEmployeeId(String employeeid)
	 {
		 this.EmployeeId=employeeid;
	 }
	 public String getEmployeeId()
	  {
		  return EmployeeId;
	  }
	 public void setEmployeeName(String employeename)
	 {
		 this.EmployeeName=employeename;
	 }
	 public String getEmployeeName()
	  {
		  return EmployeeName;
	  }
	 public void setDesignation(String  designation)
	 {
		 this.Designation= designation;
	 }
	 public String getDesignation()
	  {
		  return  Designation;
	  }
	 public void setMoblieNo(Long moblieno)
	 {
		 this.MoblieNo=moblieno;
	 }
	 public long getMoblieNo()
	  {
		  return MoblieNo;
	  }
	 public void setEmailId(String emailid)
	 {
		 this.EmailId=emailid;
	 }
	 public String getEmailId()
	  {
		  return EmailId;
	  }
	 public void setAddress(String address)
	 {
		 this.Address=address;
	 }
	 public String getAddress()
	  {
		  return Address;
	  }
	 public void setJoiningDate(String joiningDate)
	 {
		 this.JoiningDate=joiningDate;
	 }
	 public String getJoiningDate()
	  {
		  return JoiningDate;
	  }
	 public void setPreviousExperience(String previousexperience)
	 {
		 this.PreviousExperience=previousexperience;
	 }
	 public String getPreviousExperience()
	  {
		  return PreviousExperience;
	  }

}
