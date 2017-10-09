package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.google.common.base.Objects;
import com.sun.javafx.collections.MappingChange.Map;

import models.User;

public class PacemakerAPI
{
  private HashMap<Long, User> userIndex =  new HashMap<>();
  private HashMap<String, User> emailIndex = new HashMap<>();
  //private HashMap<Long, User> userIndex = new HashMap<>();
  
  public Collection<User> getUsers ()
  {
    return userIndex.values();
  }

  public  void deleteUsers() 
  {
    userIndex.clear();
    emailIndex.clear();
  }

  public User createUser(String firstName, String lastName, String email, String password) 
  {
    User user = new User (firstName, lastName, email, password);
    userIndex.put(user.id, user);
    emailIndex.put(email, user);
    return user;
  }

  public User getUserByEmail(String email) 
  {
	  return emailIndex.get(email);
  }
  
  public User getUser(Long id) 
  {
	  return userIndex.get(id);
  }

  public void deleteUser(Long id) 
  {
    User user = userIndex.remove(id);
    emailIndex.remove(user.email);
  }
  
}