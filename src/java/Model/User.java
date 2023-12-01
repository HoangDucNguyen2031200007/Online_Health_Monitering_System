package Model;

public abstract class User {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;

    public User() {
    }

    public User(String name, String email, String password, String phone, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public boolean logout() {
        return true;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone + ", address="
                + address + "]";
    }

}
