package exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTester {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("hp 123", 4000, 8192));
        computers.add(new Computer("apple imac27", 3600, 4096));
        computers.add(new Computer("dell 234", 3600, 8192));
        computers.add(new Computer("apple imac27", 3600, 8192));
        computers.add(new Computer("apple imac27", 3200, 16384));

        Collections.sort(computers);
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
