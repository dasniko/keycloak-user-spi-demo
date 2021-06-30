package dasniko.keycoak.user;

import java.util.List;

/**
 * @author Niko Köbler, http://www.n-k.de, @dasniko
 */
public class DemoUser {

    private String id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private boolean enabled;
    private Long created;
    private List<String> roles;

    public DemoUser() {
    }

    public DemoUser(String id, String firstName, String lastName, boolean enabled, Long created, List<String> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = (firstName + "." + lastName).toLowerCase();
        this.email = (firstName.replaceAll("\\s", "") + "." + lastName + "@flintstones.com").toLowerCase();
        this.password = firstName.toLowerCase();
        this.enabled = enabled;
        this.created = created;
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
