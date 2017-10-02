package controllers;

import java.util.ArrayList;
import java.util.List;

import models.User;

public class Main
{
  public static void main(String[] args)
  {
    List<User> users = new ArrayList<User>();
    users.add(new User("Bart", "Simpson", "bart@simpson.com", "secret"));
    users.add(new User("Homer", "Simpson", "bart@simpson.com", "secret"));
    users.add(new User("Lisa", "Simpson", "bart@simpson.com", "secret"));
    System.out.println(users);
  }
}