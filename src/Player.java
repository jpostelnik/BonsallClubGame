public class Player {
    private String name;
    private int score;
    private Tank tank;

    public Player(String name, Tank tank) {
        this.name = name;
        this.score = 0;
        this.tank = tank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setScore()
    {
        score++;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void rest(){
        score = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", Tank=" + tank +
                '}';
    }
}
