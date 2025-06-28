package art.timestop.todos.service;

import art.timestop.todos.response.UserResponse;

import java.util.List;

public interface AdminService {
    List<UserResponse> getAllUsers();
    UserResponse promoteToAdmin(long userId);
    void deleteNonAdminUser(long userId);
}
