package art.timestop.todos.service;

import art.timestop.todos.request.PasswordUpdateRequest;
import art.timestop.todos.response.UserResponse;

public interface UserService {
    UserResponse getUserInfo();
    void deleteUser();
    void updatePassword(PasswordUpdateRequest passwordUpdateRequest);
}
