package dasniko.keycoak.user;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
class DemoRepository {

    private List<DemoUser> users;

    DemoRepository() {
        users = Arrays.asList(
                new DemoUser("1", "Fred", "Flintstone"),
                new DemoUser("3", "Wilma", "Flintstone"),
                new DemoUser("5", "Pebbles", "Flintstone"),
                new DemoUser("2", "Barney", "Rubble"),
                new DemoUser("4", "Betty", "Rubble"),
                new DemoUser("6", "Bam Bam", "Rubble")
        );
    }

    List<DemoUser> getAllUsers() {
        return users;
    }

    int getUsersCount() {
        return users.size();
    }

    DemoUser findUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    DemoUser findUserByUsernameOrEmail(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equalsIgnoreCase(username) || user.getEmail().equalsIgnoreCase(username))
                .findFirst().orElse(null);
    }

    List<DemoUser> findUsers(String query) {
        return users.stream()
                .filter(user -> user.getUsername().contains(query) || user.getEmail().contains(query))
                .collect(Collectors.toList());
    }

    boolean validateCredentials(String username, String password) {
        return findUserByUsernameOrEmail(username).getPassword().equals(password);
    }

    boolean updateCredentials(String username, String password) {
        findUserByUsernameOrEmail(username).setPassword(password);
        return true;
    }

}
