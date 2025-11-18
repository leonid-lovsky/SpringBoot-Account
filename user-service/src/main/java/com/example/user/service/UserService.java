// package com.example.user;
//
// import com.example.shared.user.request.CreateUserRequest;
// import com.example.shared.user.request.UpdateUserRequest;
// import com.example.shared.dto.UserResponse;
// import jakarta.persistence.EntityNotFoundException;
// import lombok.RequiredArgsConstructor;
// import org.modelmapper.ModelMapper;
// import org.springframework.stereotype.Service;
//
// import java.util.List;
// import java.util.stream.Collectors;
//
// @Service
// @RequiredArgsConstructor
// public class UserService {
//
//     private final UserRepository userRepository;
//     private final ModelMapper modelMapper;
//
//     @Override
//     public UserResponse createUser(CreateUserRequest request) {
//         User user = modelMapper.map(request, User.class);
//         User savedUser = userRepository.save(user);
//         return modelMapper.map(savedUser, UserResponse.class);
//     }
//
//     @Override
//     public List<UserResponse> getAllUsers() {
//         List<User> users = userRepository.findAll();
//         return users.stream()
//             .map(user -> modelMapper.map(user, UserResponse.class))
//             .collect(Collectors.toList());
//     }
//
//     @Override
//     public UserResponse getUserById(Long id) {
//         return userRepository.findById(id)
//             .map(user -> modelMapper.map(user, UserResponse.class))
//             .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
//     }
//
//     @Override
//     public UserResponse updateUser(Long id, UpdateUserRequest request) {
//         User user = userRepository.findById(id)
//             .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
//
//         if (request.username() != null) {
//             user.setUsername(request.username());
//         }
//         if (request.email() != null) {
//             user.setEmail(request.email());
//         }
//         if (request.phone() != null) {
//             user.setPhone(request.phone());
//         }
//         if (request.password() != null) {
//             // TODO: account.user.setEncodedPassword(request.password());
//         }
//
//         User updatedUser = userRepository.save(user);
//         return modelMapper.map(updatedUser, UserResponse.class);
//     }
//
//     @Override
//     public UserResponse deleteUser(Long id) {
//         User user = userRepository.findById(id)
//             .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
//
//         userRepository.delete(user);
//
//         return modelMapper.map(user, UserResponse.class);
//     }
// }
