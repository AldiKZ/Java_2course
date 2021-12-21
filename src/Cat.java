public class Cat {
    private int endurance = 50;
    private int height = 20;
    public void run(){
        Track track = new Track();
        int getDistance = track.getDistance();
        if (endurance > getDistance)
            System.out.println("Мяу, мяу!");
        else
            System.out.println("Мяу!!!");
    }
    public void jump(){
        Wall wall = new Wall();
        int getHigh = wall.getHigh();
        if (height*5 > getHigh) //может перепрыгнуть преграду которая в 5 раз выше кота
            System.out.println("Мяяяяяу!");
        else
            System.out.println("Мрррр");
    }
}
