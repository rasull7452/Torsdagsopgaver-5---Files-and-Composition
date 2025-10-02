package task3;

import java.util.ArrayList;

// 3.g
public class Main {
    public static void main(String[] args){
        Room r1 = new Room(1, 2);
        Room r2 = new Room(1, 1);
        Room r3 = new Room(2, 2);

        // 3.h
        ArrayList<Room> roomList = new ArrayList<Room>();

        roomList.add(r1);
        roomList.add(r2);
        roomList.add(r3);

        // 3.i
        Building b1 = new Building(roomList, roomList.size());

        System.out.println(countRoomsInBuilding(b1));
        System.out.println(countLampsInBuilding(b1));
        System.out.println(countWindowsInBuilding(b1));
        System.out.println(isNormal(b1));

    }

    // 3.j
    static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        for (Room r : building.getRooms()) {
            totalLamps += r.getNumberOfLamps();
        }
        return totalLamps;
    }

    static int countWindowsInBuilding(Building building){
        int totalWindows = 0;
        for (Room s : building.getRooms()) {
            totalWindows += s.getNumberOfWindows();
        }
        return totalWindows;
    }

    static int countRoomsInBuilding(Building building){
        return building.getRooms().size();
    }

    // 3.k
    static boolean isNormal(Building building){
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}
