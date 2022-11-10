package genericsTony;

public class Champion<T> {

    T passive;

    public T getPassive() {
        return passive;
    }

    public void setPassive(T passive) {
        this.passive = passive;
    }
}
