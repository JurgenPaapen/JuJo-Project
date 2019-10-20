package clockyourhours.BusinessLogicLayer;

import clockyourhours.DataStorageLayer.ClientRegistrationDAO;

public class ClientRegistrationImpl implements RegistrationManager {


    public void add(String name, int IDClient) {
        String query = "INSERT INTO Project (ProjectName, ClientID) " + "VALUES ('"+name+"','"+IDClient+"')";
        ClientRegistrationDAO.addProjectToDatabase(query);
    }

//    @Override
//    public static void add(String projectName, int IDClient, String client) {
//
//        String query = "INSERT INTO project (ProjectName, ClientID) " + "VALUES (" + projectName + "," + IDClient + ")";
//        ClientRegistrationDAO.addProjectToDatabase(query);

    }
