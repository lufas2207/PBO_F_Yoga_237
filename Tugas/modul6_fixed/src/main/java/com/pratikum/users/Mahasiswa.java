package main.java.com.praktikum.users;

public class Mahasiswa extends User {
    private String nim;

    public Mahasiswa(String username, String password, String nim) {
        super(username, password);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
}
