package dasniko.keycoak.user;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
public class DemoRepository {

    private List<DemoUser> users;

    public DemoRepository() {
        users = Arrays.asList(
                new DemoUser("1", "Katie", "Washington"),
                new DemoUser("2", "Enrique", "Perkins"),
                new DemoUser("3", "Joshua", "Little"),
                new DemoUser("4", "Billie", "Newman"),
                new DemoUser("5", "Leslie", "Thompson")
        );
    }

    public List<DemoUser> getAllUsers() {
        return users;
    }

    public int getUsersCount() {
        return users.size();
    }

    public DemoUser findUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }

    public DemoUser findUserByUsernameOrEmail(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equalsIgnoreCase(username) || user.getEmail().equalsIgnoreCase(username))
                .findFirst().get();
    }

    public List<DemoUser> findUsers(String query) {
        return users.stream()
                .filter(user -> user.getUsername().contains(query) || user.getEmail().contains(query))
                .collect(Collectors.toList());
    }

    public boolean validateCredentials(String username, String password) {
        return findUserByUsernameOrEmail(username).getPassword().equals(password);
    }

    public boolean updateCredentials(String username, String password) {
        findUserByUsernameOrEmail(username).setPassword(password);
        return true;
    }

}
