package ml.bootcode.spring.oauth.service;

import java.util.List;

import ml.bootcode.spring.oauth.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	void delete(long id);
}