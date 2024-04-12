package com.Finance.exmanager.services;

import java.util.List;

import com.Finance.exmanager.model.User;

public interface UserService {
  User createUser(User user);
  User getUser(Long id);
  List<User> getAllUsers();
  User updateUser(Long id, User user);
  void deleteUser(Long id);
}
