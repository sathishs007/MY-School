package com.school.dataserv.model;

public class JwtUser extends BaseBO{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5422645650485628450L;
	
	private String userName;
    private int  id;
    private String role;
    private String password;
  ;

    /**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

	

	

	

	
	
}
