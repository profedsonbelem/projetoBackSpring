package br.com.arq.back.dto;

public class AuthenticateResponse {
	   private String username;
	    private String password;
	    
	    public AuthenticateResponse() {
			// TODO Auto-generated constructor stub
		}
	    
		public AuthenticateResponse(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		
		@Override
		public String toString() {
			return "AuthenticationRequest [username=" + username + ", password=" + password + "]";
		}

		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	    
}
