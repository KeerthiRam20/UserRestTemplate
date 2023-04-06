package com.example.UserRestTemplate.Entity;

public class UserDto {

	 private int userid;
	    private String firstName;
	    private String lastName;
	    private String email;
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public UserDto() {
			
		}
		
		@Override
		public String toString() {
			return "UserDto [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ "]";
		}
		public UserDto(int id, String firstName, String lastName, String email) {
			super();
			this.userid = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
	    
	    
}
