import java.util.ArrayList;

public class Maraphone {
    private String name;
    public ArrayList<Runner> runners=new ArrayList<>();

    public Maraphone(String name) {
        this.name = name;
    }
    public void getNumber(Runner runner){
        if(runners.contains(runner)){
            runner.getNumber();
        } else {
            System.out.println("no one come :((");
        }
    }
    public String print(){
        StringBuilder stringBuilder=new StringBuilder();
        for (Runner r:runners){
            stringBuilder.append(r).append("\n");
        } return stringBuilder.toString();
    }
}
