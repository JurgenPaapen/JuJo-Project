package clockyourhours.Main;
import clockyourhours.BusinessLogicLayer.TimeRegistrationImpl;


import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;
import clockyourhours.DomainModelLayer.Task;


import java.sql.Time;
import java.util.*;

public class Main {
//    private static Task taskList = new Task();

    public static void main(String[] args) {
//
///**
// * Client 1 met een project en een taak
// */
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
///**
// * Client 2 met een project en een taak
// */
//
//        Client c2 = new Client(2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");
//        Project c2_p1 = new Project("Keuken", c2);
//        Task c2_p1_task1 = new Task("afwerking", 35);
//        c2_p1.addTask(c2_p1_task1);
//        Task c2_p1_task2 = new Task("inmeten", 30);
//        c2_p1.addTask(c2_p1_task2);
//
//        Project c2_p2 = new Project("Kozijnen", c1);
//        Task c2_p2_task1 = new Task("inmeten", 25);
//        c2_p2.addTask(c2_p2_task1);
//        Task c2_p2_task2 = new Task("plaatsen", 45);
//        c2_p2.addTask(c2_p2_task2);
//
//        c2.addProject(c2_p1);
//        c2.addProject(c2_p2);
//
//
//        /**
//         * Client 3 met een project en een taak
//         */
////        ArrayList<String> t5 = new ArrayList<>();
////        t5.add("voorlichting");
////        t5.add("Hulp op afstand");
////
////        ArrayList<String> t6 = new ArrayList<>();
////        t6.add("hoofdschakelaar omzeilen");
////        t6.add("Wietplantage aanleggen");
////
////        HashMap<String, ArrayList> p3 = new HashMap<>();
////
////        p3.put("Domotica",t5);
////        p3.put("Meterkast",t6);
////
////
////        Client c3;
////        c3 = new Client(p3,3, "Paapen Electra Bouw", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");
//
//
//        List<Client> clients = new ArrayList<>(Arrays.asList(c1,c2));
//
//        for (Client client : clients) {
//                System.out.println("client " + client.getCompanyName() + " heeft de volgende projecten " ) ;
//            System.out.println(client);
//        }
        try {
            TimeRegistrationImpl start = new TimeRegistrationImpl();
            long start1 = start.startTimer();
            System.out.println(start1);
            Thread.sleep(5 * 60 * 10);
            TimeRegistrationImpl end = new TimeRegistrationImpl();
            long end1 = end.stopTimer();
            System.out.println(end1);
            TimeRegistrationImpl diff = new TimeRegistrationImpl();
            System.out.println(diff.timeDifference( end1, start1));
        } catch (Exception e) {
            System.out.println("Got sn exception!");

        }


//            long diff = (end - start);
//            System.out.println("Difference is : " + diff + " milliseconds");
//        } catch (Exception e) {
//            System.out.println("Got sn exception!");

    }

}