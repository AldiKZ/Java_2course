public class Robot {
    private int endurance = 200;
    private int height = 70;
    public void run(){
        Track track = new Track();
        int getDistance = track.getDistance();
        if (endurance > getDistance)
            System.out.println("Это слишком просто");
        else
            System.out.println("Не хватает заряда батареи");
    }
    public void jump(){
        Wall wall = new Wall();
        int getHigh = wall.getHigh();
        if (height > getHigh) //может перепрыгнуть через преграду с выостой во весь рост
            System.out.println("Это слишком просто");
        else
            System.out.println("Моя конструкция не позволяет мне это сделать");
    }
}
