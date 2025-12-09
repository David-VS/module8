package be.ehb.gebruiker;

import java.io.Serializable;


public class Gebruiker implements Serializable {

    private String username;
    private String email;
    //private transient Role role;//transient -> niet mee serializeren
    private Role role;

    public Gebruiker(String username, String email) {
        this.username = username;
        this.email = email;
        this.role = new Role();
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

    @Override
    public String toString() {
        return "Gebruiker{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
