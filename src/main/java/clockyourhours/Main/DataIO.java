package clockyourhours.Main;

import clockyourhours.DomainModelLayer.Client;

import java.io.*;
import java.util.ArrayList;

public class DataIO {

    public static void writePersonTOObjectFile(String fileName, ArrayList client) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            objectOutputStream.writeObject(client);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Client> readFromObjectFile(String fileName) {
        ArrayList<Client> registration = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            registration = (ArrayList<Client>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return registration;
    }
}
