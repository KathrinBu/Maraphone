public class HeadLiner extends Runner{
    private final String medals;

    @Override
    public String toString() {
        return "HeadLiner{" +
                "medals='" + medals + '\'' +
                '}';
    }

    public String getMedals() {
        return medals;
    }

    public HeadLiner(int number, String firstName, String lastName, String medals) {
        super(number, firstName, lastName);
        this.medals=medals;
    }
}