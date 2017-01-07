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
	//private String nick_name;
	private String passwd;
	//private String register_date;
	//private String profile_pic_path;
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
}
