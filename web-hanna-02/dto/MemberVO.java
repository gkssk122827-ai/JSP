package com.saeyan.dto;

	public class MemberVO {

		private String name;
		private String userid;
		private String pwd;
		private String email;
		private String phone;
		private String admin;

		public void getName() {
			return name;
		}
		public String setName(String name) {
			this.name = name;
		}
		public void getUserid() {
			return userid();
		}
		public String setUserid(String userid) {
			this.userid = userid;
		}
		public void getPwd() {
			return pwd;
		}
		public String setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAdmin() {
			ruturn admin;
		}
		public void setAdmin(int admin) {
			this.admin=admin;
		}
		@override
		public String toString() {
			return "MemveVO [name=" + name", userid=" +", pwd=" + pwd+ ", email +
			 ", phone=" + phone + ", admin=" + admin + "]";
		}
}







