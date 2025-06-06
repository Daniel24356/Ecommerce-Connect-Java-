package Daniel24356.com.Ecommerce.services;

import Daniel24356.com.Ecommerce.dtos.requests.ProfilePatchRequest;
import Daniel24356.com.Ecommerce.dtos.requests.UserUpdateRequest;
import Daniel24356.com.Ecommerce.dtos.response.UserDetailResponse;
import Daniel24356.com.Ecommerce.dtos.response.UserListResponse;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.List;

public interface UserService {

    List<UserListResponse> getAllUsers();
    UserDetailResponse getUserById(Long id);
    UserDetailResponse updateUser(Long id, UserUpdateRequest request);
    Long getUserIdFromPrincipal(Principal principal);
    void deleteUser(Long id);
    UserDetailResponse getUserByEmail(String email);
    UserDetailResponse updateUserProfile(String email, ProfilePatchRequest request);
    String updateProfilePicture(String email, MultipartFile file);
}
