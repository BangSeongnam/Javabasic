package javaStudy.dayStudy;

public class user {
	
	
		private String id;
		private String password;
		private String nickName;
		
		
		public user(String id, String password) {
			this.id = id;
			this.password = password;
		}
		
		
		public user(String id, String password, String nickName) {
			this(id,password);
			this.nickName = nickName;
		}
		
		
		public String toString() {
			return "닉네임은 : " + nickName;
		}
		
		public boolean login(String password)
		{
			if(this.password.equals(password)) {
				return true;
				}else {
					return false;
				}
			}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getNickName() {
			return nickName;
		}


		public void setNickName(String nickName) {
			this.nickName = nickName;
		}
	

		
	}


