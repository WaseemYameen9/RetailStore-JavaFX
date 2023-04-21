package com.example.retailstoresystem;

import java.io.Serializable;
import java.util.*;
import java.io.*;
public class MuserDL implements Serializable {
    private static List<Muser> musers=new ArrayList<>();

    public static void addUser(Muser user){
        musers.add(user);
        storeUserToFile("users.dat", musers);
    }
    public static void deleteUser(String userName){
        for (Muser user:musers) {
            if(user.getUserName().equals(userName))
            {
                musers.remove(user);
                return;
            }
        }
        storeUserToFile("users.dat", musers);
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
    public static void storeUserToFile(String filename, List<Muser> musers) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(musers);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadUserFromBinaryFile(String filename) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
            musers = (ArrayList<Muser>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
