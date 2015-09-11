
package bean;
 public class AdminRegBean
 {
	 private String AdminId;
	 private String AdminPassword;
	  
	 public void setAdminId(String adminid)
	 {
		 this.AdminId=adminid;
	 }
	 public void setAdminPassword(String adminpassword)
	 {
		 this.AdminPassword=adminpassword;
	 }
	 public String getAdminId()
	  {
		  return AdminId;
	  }
	 public String getAdminPassword()
	  {
		  return AdminPassword;
	  }
 }