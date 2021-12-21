public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Track track = new Track();
        Wall wall = new Wall();

//        Object[] players = new Object[3];
//        players[0] = man;
//        players[1] = cat;
//        players[2] = robot;
        // Хотел выполнить 3 пункт, но так и не понял как это реализовать
//
//        Object[] obstacles = new Object[2];
//        obstacles[0] = track;
//        obstacles[1] = wall;
        man.run();
        man.jump();
        cat.run();
        cat.jump();
        robot.run();
        robot.jump();
    }
}
