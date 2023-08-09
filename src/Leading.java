public class Leading extends Master{
    public Leading(String name, String surname, int price) {
        super(name, surname, price);
    }

    @Override
    public String toString() {
        return "Leading{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int zarplata(int kolvoRunners) {

        int zarplata=kolvoRunners*price;
        return zarplata;
    }
    public Runner run(Runner r){
        r.getNumber();
        return r;
    }
}
