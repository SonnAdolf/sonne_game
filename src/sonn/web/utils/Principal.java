package sonn.web.utils;

public class Principal {
	/**
	 * @param id
	 *            ID
	 * @param username
	 *            用户名
	 */
	public Principal(int id, String username, String role)
	{
		this.id = id;
		this.username = username;
		this.role = role;
	}
	
	/* ID */
	private int id;

	/* 用户名 */
	private String username;
	
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
