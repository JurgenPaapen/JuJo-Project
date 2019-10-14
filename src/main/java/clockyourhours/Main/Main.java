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

        Project projectList = new Project();
        Task taskList = new Task();
        taskList.addTask("opbouw", 25);
        taskList.addTask("afwerking", 45);
        projectList.addProject("Dakkapel", taskList);

        System.out.println(taskList);

        Task taskList2 = new Task();
        taskList2.addTask("aanleg", 25);
        taskList2.addTask("grondwerk", 45);

        System.out.println(taskList2);

        projectList.addProject("tuinhuis",taskList2);

        System.out.println(projectList);

        Client c1;
        c1 = new Client(projectList,1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");
/**
 * Client 2 met een project en een taak
 */

//        ArrayList<String> t3 = new ArrayList<>();
//        t3.add("inmeten");
//        t3.add("afwerking");
//
//        ArrayList<String> t4 = new ArrayList<>();
//        t4.add("tekenen");
//        t4.add("transport");
//
//        HashMap<String,ArrayList > p2 = new HashMap<>();
//
//        p2.put("Kozijnen", t4);
//        p2.put("Keuken",t4);
//
//        Client c2;
//        c2 = new Client(p2,2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");


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
            System.out.println("client " + client.getCompanyName() + " heeft de volgende projecten " + projectList.getProject() + " " + taskList.getTaskList()) ;
        }

        System.out.println(c1);
        System.out.println(projectList);
        System.out.println(taskList + " " + taskList2);



    }

}