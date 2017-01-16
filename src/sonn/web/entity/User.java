package sonn.web.entity;

/**
* @ClassName: User 
* @Description: entity class of Usr.
* @author sonne
* @date 2017-1-6 21:24:00 create the class 
* @version 1.0
 */
public class User {
	private int id;
	private String usrname;
	private String passwd;
	private String nick_name;
	private String register_date;
	private String profile_pic_path;
	private boolean is_admin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getRegister_date() {
		return register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	public String getProfile_pic_path() {
		return profile_pic_path;
	}
	public void setProfile_pic_path(String profile_pic_path) {
		this.profile_pic_path = profile_pic_path;
	}
	public boolean isIs_admin() {
		return is_admin;
	}
	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}
}
