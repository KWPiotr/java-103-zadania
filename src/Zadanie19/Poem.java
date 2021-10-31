package Zadanie19;

public class Poem {
    Author creator;
    int stropheNumber;

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator.getSurname() +
                ", stropheNumber=" + stropheNumber +
                '}';
    }
}
