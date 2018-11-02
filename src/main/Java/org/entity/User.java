
package org.entity;
public class User {



    public String getEmeil() {
        return email;
    }

    public void setEmeil(String emeil) {
        this.email = emeil;
    }
    String login;
    String email;
    String password;

    public Boolean getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
    }

    Boolean isadmin;

    public User() {
    }

    public User(String login,String emeil, String password) {
        this.login = login;
        this.password = password;
        this.email = emeil;
        isadmin=false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Login='" + login + '\'' +
                ", emeil='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isadmin=" + isadmin +
                '}';
    }
}
