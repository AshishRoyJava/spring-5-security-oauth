package ml.bootcode.spring.oauth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ml.bootcode.spring.oauth.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
