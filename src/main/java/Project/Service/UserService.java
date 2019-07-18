package Project.Service;

import Project.Model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}