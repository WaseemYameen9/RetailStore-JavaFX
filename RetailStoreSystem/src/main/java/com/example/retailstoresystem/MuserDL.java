package com.example.retailstoresystem;

import java.util.*;

public class MuserDL {
    private static List<Muser> musers=new ArrayList<>();

    public static void addUser(Muser user){
        musers.add(user);
    }
    public static void deleteUser(String userName){
        for (Muser user:musers) {
            if(user.getUserName().equals(userName))
            {
                musers.remove(user);
                return;
            }
        }
    }
    public static Muser getUser(String userName,String userPassword){
        for (Muser user:musers) {
            if(user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword))
            {
                return user;
            }
        }
        return null;
    }
    public static String getUserRole(String userName,String userPassword){
        for (Muser user:musers) {
            if(user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword))
            {
                return user.getUserRole();
            }
        }
        return null;
    }
}
