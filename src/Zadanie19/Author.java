package Zadanie19;

public class Author {
    private String surname;
    private String nationality;

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }

    public String toSting() {
        return String.format("Autor: %s, narodowość: %s", surname, nationality);
    }

}