/**
 * Created by Ромашка on 07.09.2017.
 */
public class User {

    private int id;
    private String username;
    private String password;

    public User() {

    }

    public User(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public User(final int id, final String username, final String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id: " + id
                + ", userName " + username
                + ", password " + password
                + "}";
    }
}
