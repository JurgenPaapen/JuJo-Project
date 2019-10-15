package clockyourhours.Main;

import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;
import clockyourhours.DomainModelLayer.Task;


import java.util.*;

public class Main {
//    private static Task taskList = new Task();

    public static void main(String[] args) {
        // create a ArrayList String type
        // and Initialize an ArrayList with asList()
/**
 * Client 1 met een project en een taak
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

/**
 * Client 2 met een project en een taak
 */
//        projectList = new Project();
//        taskList = new Task();
//        taskList.addTask("afwerking", 25);
//        taskList.addTask("inmeten", 45);
//        projectList.addProject("Keuken", taskList);
//
//        taskList = new Task();
//        taskList.addTask("inmeten", 25);
//        taskList.addTask("plaatsen", 45);
//        projectList.addProject("Kozijnen",taskList);
//
//        Client c2;
//        c2 = new Client(projectList,2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");


        /**
         * Client 3 met een project en een taak
         */
//        ArrayList<String> t5 = new ArrayList<>();
//        t5.add("voorlichting");
//        t5.add("Hulp op afstand");
//
//        ArrayList<String> t6 = new ArrayList<>();
//        t6.add("hoofdschakelaar omzeilen");
//        t6.add("Wietplantage aanleggen");
//
//        HashMap<String, ArrayList> p3 = new HashMap<>();
//
//        p3.put("Domotica",t5);
//        p3.put("Meterkast",t6);
//
//
//        Client c3;
//        c3 = new Client(p3,3, "Paapen Electra Bouw", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");


        List<Client> clients = new ArrayList<>(Arrays.asList(c1));

        for (Client client : clients) {
                System.out.println("client " + client.getCompanyName() + " heeft de volgende projecten " ) ;
            System.out.println(client);
        }
//

//        System.out.println(c1);
//        System.out.println(projectList);
//        System.out.println(taskList + " " + taskList2);



    }

}