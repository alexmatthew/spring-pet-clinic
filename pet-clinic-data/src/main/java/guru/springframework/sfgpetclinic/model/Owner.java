package guru.springframework.sfgpetclinic.model;

public class Owner extends Person{
    private String firstName;
    private String lastName;

    public Owner(String firstName, String lastName, String firstName1, String lastName1) {
        super(firstName, lastName);
        this.firstName = firstName1;
        this.lastName = lastName1;
    }
}
