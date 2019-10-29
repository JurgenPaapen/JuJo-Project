package clockyourhours.Main;

import clockyourhours.BusinessLogicLayer.ClientRegistrationImpl;
import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;
import clockyourhours.PresentationLayer.*;
import javax.swing.*;
import java.io.File;
import java.util.*;


public class Main {
    private static Object Client;
//    private static Task taskList = new Task();

    public static void main(String[] args) {

        /**
         * Read and write path directory for file with data
         */

        File tempFile = new File("txtfiles/", "tempfile.obj");
        String tempFilePath = tempFile.getAbsolutePath();


        /**
         * Code we use to read the data from a file
         */

        ArrayList<Client> clients = DataIO.readFromObjectFile(tempFilePath);

        for (Client client : clients) {
            for (Project project : client.getProjects()) {
                System.out.println("client " + client.getCompanyName() + " heeft een project " + project + " met de volgende taken:  ");
                for (Object task : project.getTask()) {
                    System.out.print(task);
                }
                System.out.println();

            }
        }

        /**
         * adding a project to client fritsen in the database
         */
        ClientRegistrationImpl fritsen = new ClientRegistrationImpl();
        int clientID = clients.get(1).getID();
        fritsen.add("Kantoortuin", clientID);

        /**
         * opening GUI frame
         */
        SwingUtilities.invokeLater(new TimeRegistrationLayerGUI(clients));
    }
}
