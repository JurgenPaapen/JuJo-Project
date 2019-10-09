package clockyourhours.DataStorageLayer;

import java.io.*;

public class ClientRegistrationIO {

    public static void writePersonTOObjectFile(String fileName, Person person) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person readFromObjectFile(String fileName) {
        Person registration = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            registration = (Person) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return registration;
    }
}
