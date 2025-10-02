package task3;

import java.util.ArrayList;

// 3.d
public class Building {

    ArrayList<Room> rooms = new ArrayList<>();
    int numberOfFloors;

    // 3.e
    public Building(ArrayList<Room> rooms, int numberOfFloors){

        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;

    }

    // 3.f
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
