package dasniko.keycoak.user;

import org.keycloak.models.RealmModel;
import org.keycloak.models.RoleContainerModel;
import org.keycloak.models.RoleModel;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author Niko Köbler, https://www.n-k.de, @dasniko
 */
public class UserRoleModel implements RoleModel {

    private String name;
    private final RealmModel realm;

    public UserRoleModel(String name, RealmModel realm) {
        this.name = name;
        this.realm = realm;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public String getId() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void addCompositeRole(RoleModel role) {

    }

    @Override
    public void removeCompositeRole(RoleModel role) {

    }

    @Override
    public Stream<RoleModel> getCompositesStream() {
        return null;
    }

    @Override
    public boolean isClientRole() {
        return false;
    }

    @Override
    public String getContainerId() {
        return realm.getId();
    }

    @Override
    public RoleContainerModel getContainer() {
        return realm;
    }

    @Override
    public boolean hasRole(RoleModel role) {
        return this.equals(role) || this.name.equals(role.getName());
    }

    @Override
    public void setSingleAttribute(String name, String value) {

    }

    @Override
    public void setAttribute(String name, List<String> values) {

    }

    @Override
    public void removeAttribute(String name) {

    }

    @Override
    public Stream<String> getAttributeStream(String name) {
        return null;
    }

    @Override
    public Map<String, List<String>> getAttributes() {
        return null;
    }
}
