package task3;

// 3.a
public class Room {
    int numberOfLamps;
    int numberOfWindows;

    // 3.b
    public Room(int numberOfLamps, int numberOfWindows){

        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }

    // 3.c
    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
