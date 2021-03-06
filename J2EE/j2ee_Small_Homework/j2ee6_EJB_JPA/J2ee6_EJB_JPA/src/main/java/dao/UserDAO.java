package dao;

import javax.ejb.Remote;

/**
 * @author Qiang
 * @since 03/01/2017
 */
@Remote
public interface UserDAO {
    /**
     *
     * @param username
     * @param password
     * @return user id if user exists, or -1 if user does not exist
     */
    int userExists(String username, String password);


}
