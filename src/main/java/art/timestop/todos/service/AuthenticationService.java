package art.timestop.todos.service;

import art.timestop.todos.request.AuthenticationRequest;
import art.timestop.todos.request.RegisterRequest;
import art.timestop.todos.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
