package DAO;

import java.util.List;

/**
 * Created by gerar_000 on 15/03/2016.
 */
public interface UserDao {

    public void insertData(User user);
    public List<User> getUserList();
    public void insertDataAdmin(User user);
    public void updateData(User user);
    public void deleteData(String id);
    public User getUser(String id);

}