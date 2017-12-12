/**
 * 
 */
package com.qhit.lh.gr3.acg.t8.dao;

import java.util.List;

import com.qhit.lh.gr3.acg.t8.bean.User;

/**
 * @author 袁帅
 * TODO
 * 2017年12月11日上午11:17:52
 */
public interface UserDao {
	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登录业务的实现
	 * @throws Exception 
	 */
	public User doLogin(String userName,String userPassword) throws Exception;
	/**
	 * @return
	 * @throws Exception
	 * 获取所有用户对象
	 */
	public List<User> getAllUser() throws Exception;
	/**
	 * @param user
	 * @return
	 * @throws Exception
	 * 添加用户
	 */
	public int addUser(User user) throws Exception;
	/**
	 * @return
	 * @throws Exception
	 * 删除
	 */
	public int deleteUser(User user) throws Exception;
	/**
	 * @return
	 * @throws Exception
	 * 准备更新
	 */
	public User toUpdateUser(User user) throws Exception;
	/**
	 * @return
	 * @throws Exception
	 * 更新业务
	 */
	public int updateUser(User user) throws Exception;
	/**
	 * @return
	 * @throws Exception
	 * 根据名字业务
	 */
	public List<User> getUser(User user) throws Exception;
}
