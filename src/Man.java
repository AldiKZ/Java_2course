public class Man {

    private int endurance = 100;
    private int height = 100;

    public int getEndurance() {
        return endurance;
    }
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }


    public void run(){
        Track track = new Track();
        int getDistance = track.getDistance();
        if (endurance > getDistance)
            System.out.println("Хорошая была пробежка");
        else
            System.out.println("Не хватает выносливости");
    }
    public void jump(){
        Wall wall = new Wall();
        int getHigh = wall.getHigh();
        if (height/2 > getHigh) //человек может перепрыгнуть через преграду в 2 раза меньше роста
            System.out.println("Я сделал это! Не зря качал ноги");
        else
            System.out.println("Не могу перепрыгнуть эту преграду");
    }
}
