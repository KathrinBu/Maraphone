public abstract class Master {
    String name;
    String surname;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Master(String name, String surname, int price) {
        this.name = name;
        this.surname = surname;
        this.price = price;
    }


    public abstract int zarplata(int kolvoRunners);
}
