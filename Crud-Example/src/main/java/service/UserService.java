package service;

import java.util.List;
import entity.User;

public interface UserService {
	List<User> findAll();

	User findById(Long id);

	User save(User user);

	User update(Long id, User user);

	void delete(Long id);
}
