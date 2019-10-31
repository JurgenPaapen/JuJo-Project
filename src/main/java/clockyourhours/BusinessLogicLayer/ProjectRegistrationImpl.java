package clockyourhours.BusinessLogicLayer;


import clockyourhours.DataStorageLayer.ClientRegistrationDAO;

public class ProjectRegistrationImpl implements RegistrationManager {

    @Override
    public void add(String name, int ID) {
        String query = "INSERT INTO Task (TaskName, ProjectID2) " + "VALUES ('"+name+"','"+ID+"')";
        ClientRegistrationDAO.addProjectToDatabase(query);
    }
}