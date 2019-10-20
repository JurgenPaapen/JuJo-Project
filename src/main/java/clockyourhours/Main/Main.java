package clockyourhours.Main;

import clockyourhours.BusinessLogicLayer.ClientRegistrationImpl;
import clockyourhours.BusinessLogicLayer.TaskRegistrationImpl;
import clockyourhours.BusinessLogicLayer.TimeRegistrationImpl;
import clockyourhours.DataStorageLayer.ClientRegistrationDAO;
import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;
import clockyourhours.DomainModelLayer.Task;
import clockyourhours.PresentationLayer.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;


public class Main {
    private static Object Client;
//    private static Task taskList = new Task();

    public static void main(String[] args) {

/**
 * code which we used to export to the file It contains client data and connected projects and tasks within those projects.
 * <p>
 * timer test to see whether methods in other package and other classes can be reached from the main class
 * We will not implement this method in the final application but will use this code in the UI
 */

        Client c1 =  new Client(1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");
        Project p1 = new Project("Dakkapel", c1);
        Task p1_task1 = new Task("opbouw", 25);
        p1.addTask(p1_task1);
        Task p1_task2 = new Task("afwerking", 45);
        p1.addTask(p1_task2);

        Project p2 = new Project("Tuinhuis", c1);
        Task p2_task1 = new Task("grondwerk", 25);
        p2.addTask(p2_task1);
        Task p2_task2 = new Task("opbouw", 45);
        p2.addTask(p2_task2);

        c1.addProject(p1);
        c1.addProject(p2);


        Client c2 = new Client(2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");
        Project c2_p1 = new Project("Keuken", c2);
        Task c2_p1_task1 = new Task("afwerking", 35);
        c2_p1.addTask(c2_p1_task1);
        Task c2_p1_task2 = new Task("inmeten", 35);
        c2_p1.addTask(c2_p1_task2);

        Project c2_p2 = new Project("Kozijnen", c2);
        Task c2_p2_task1 = new Task("inmeten", 95);
        c2_p2.addTask(c2_p2_task1);
        Task c2_p2_task2 = new Task("plaatsen", 65);
        c2_p2.addTask(c2_p2_task2);

        c2.addProject(c2_p1);
        c2.addProject(c2_p2);

        Client c3 = new Client(3, "Paapen Electra", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");
        Project c3_p1 = new Project("Domotica", c3);
        Task c3_p1_task1 = new Task("voorlichting", 125);
        c3_p1.addTask(c3_p1_task1);
        Task c3_p1_task2 = new Task("hulp op afstand", 90);
        c3_p1.addTask(c3_p1_task2);

        Project c3_p2 = new Project("Meterkast", c3);
        Task c3_p2_task1 = new Task("hoofdschakelaar omzeilen", 85);
        c3_p2.addTask(c3_p2_task1);
        Task c3_p2_task2 = new Task("wietplantage aanleggen", 145);
        c3_p2.addTask(c3_p2_task2);

        c3.addProject(c3_p1);
        c3.addProject(c3_p2);

       ArrayList<Client> clients = new ArrayList<>(Arrays.asList(c1,c2,c3));


        /**
         * Read the data from file into clients and represent the summary
         */

        File tempFile = new File("txtfiles/", "tempfile.obj");
        String tempFilePath = tempFile.getAbsolutePath();


        /**
         * Code we used to write the data to a file
         */

        System.out.println(tempFilePath);
        DataIO.writePersonTOObjectFile(tempFilePath, clients);

//        ArrayList<Client> clients = DataIO.readFromObjectFile(tempFilePath);


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
         * adding a project to a client in the database
         */
        int clientID = clients.get(1).getID();
        ClientRegistrationImpl.add("Kantoortuin", clientID);

        /**
         * opening GUI frame
         */
        SwingUtilities.invokeLater(new TaskRegistrationLayerGUI(clients));
    }
}


/**
 * code which we used to export to the file It contains client data and connected projects and tasks within those projects.
 * <p>
 * timer test to see whether methods in other package and other classes can be reached from the main class
 * We will not implement this method in the final application but will use this code in the UI
 */

//        Client c1 =  new Client(1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");
//        Project p1 = new Project("Dakkapel", c1);
//        Task p1_task1 = new Task("opbouw", 25);
//        p1.addTask(p1_task1);
//        Task p1_task2 = new Task("afwerking", 45);
//        p1.addTask(p1_task2);
//
//        Project p2 = new Project("Tuinhuis", c1);
//        Task p2_task1 = new Task("grondwerk", 25);
//        p2.addTask(p2_task1);
//        Task p2_task2 = new Task("opbouw", 45);
//        p2.addTask(p2_task2);
//
//        c1.addProject(p1);
//        c1.addProject(p2);
//
//
//        Client c2 = new Client(2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");
//        Project c2_p1 = new Project("Keuken", c2);
//        Task c2_p1_task1 = new Task("afwerking", 35);
//        c2_p1.addTask(c2_p1_task1);
//        Task c2_p1_task2 = new Task("inmeten", 35);
//        c2_p1.addTask(c2_p1_task2);
//
//        Project c2_p2 = new Project("Kozijnen", c2);
//        Task c2_p2_task1 = new Task("inmeten", 95);
//        c2_p2.addTask(c2_p2_task1);
//        Task c2_p2_task2 = new Task("plaatsen", 65);
//        c2_p2.addTask(c2_p2_task2);
//
//        c2.addProject(c2_p1);
//        c2.addProject(c2_p2);
//
//        Client c3 = new Client(3, "Paapen Electra", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");
//        Project c3_p1 = new Project("Domotica", c3);
//        Task c3_p1_task1 = new Task("voorlichting", 125);
//        c3_p1.addTask(c3_p1_task1);
//        Task c3_p1_task2 = new Task("hulp op afstand", 90);
//        c3_p1.addTask(c3_p1_task2);
//
//        Project c3_p2 = new Project("Meterkast", c3);
//        Task c3_p2_task1 = new Task("hoofdschakelaar omzeilen", 85);
//        c3_p2.addTask(c3_p2_task1);
//        Task c3_p2_task2 = new Task("wietplantage aanleggen", 145);
//        c3_p2.addTask(c3_p2_task2);
//
//        c3.addProject(c3_p1);
//        c3.addProject(c3_p2);

//       ArrayList<Client> clients = new ArrayList<>(Arrays.asList(c1,c2,c3));


/**
 * timer test to see whether methods in other package and other classes can be reached from the main class
 * We will not implement this method in the final application but will use this code in the UI
 *
 * */
//        try {
//            TimeRegistrationImpl start = new TimeRegistrationImpl();
//            long start1 = start.startTimer();
//            System.out.println(start1);
//                    try {
//                        Thread.sleep(5 * 60 * 10);
//                    } catch (InterruptedException e1) {
//                        e1.printStackTrace();
//                    }
//        TimeRegistrationImpl end = new TimeRegistrationImpl();
//            long end1 = end.stopTimer();
//            System.out.println(end1);
//            TimeRegistrationImpl diff = new TimeRegistrationImpl();
//            System.out.println(diff.timeDifference( end1, start1));
//        } catch (Exception e) {
//            System.out.println("Got sn exception!");
//
//        }
