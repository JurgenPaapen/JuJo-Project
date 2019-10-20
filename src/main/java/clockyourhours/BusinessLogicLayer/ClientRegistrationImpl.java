package clockyourhours.BusinessLogicLayer;

import clockyourhours.DataStorageLayer.ClientRegistrationDAO;

public class ClientRegistrationImpl implements RegistrationManager {


    public void add(String name, int IDClient) {
        String query = "INSERT INTO Project (ProjectName, ClientID) " + "VALUES ('"+name+"','"+IDClient+"')";
        ClientRegistrationDAO.addProjectToDatabase(query);
    }

    }
