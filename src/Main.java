public class Main {
    public static void main(String[] args) {
        Maraphone maraphone1 = new Maraphone("SPB");
        Runner runner1 = new Runner(1, "Vasya", "Pypkin");
        Runner runner2 = new Runner(2, "Mysja", "Pypkina");
        HeadLiner headLiner = new HeadLiner(7, "Vissyariy", "Dynkin", "GOLD");
        Leading leading=new Leading("Das","Vasin",50);
        maraphone1.runners.add(runner1);
        maraphone1.runners.add(runner2);
        maraphone1.runners.add(headLiner);
        int kolvo=maraphone1.runners.size();
        int zarplata=leading.zarplata(kolvo);
        //  System.out.println(maraphone1.runners.get(0));
        System.out.println(maraphone1.print());
        System.out.println("zarplata - "+zarplata+" $$");

    }
}
