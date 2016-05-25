package com.vip.vbank.master.dao;

import com.vip.vbank.master.model.User;

public interface UserDao {
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public void find();
}
