package Services;

import com.example.mytelegrambot.models.Role;

public interface UserService {
    boolean hasRole(Role role, Long userId);
}
