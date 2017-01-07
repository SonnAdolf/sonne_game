package sonn.web.mapper;

import java.util.List;

import sonn.web.entity.User;

/**
* @ClassName: UserMapper 
* @Description: User Mapper Interface
* @author sonne
* @date 2017-1-7 15:51:11 
* @version 1.0
 */
public interface UserMapper {
	public List<User> findAll();
}
