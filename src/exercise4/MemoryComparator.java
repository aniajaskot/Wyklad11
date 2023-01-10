package exercise4;

import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer comp1, Computer comp2) {
        return Integer.compare(comp1.getMemory(), comp2.getMemory());
    }
}

