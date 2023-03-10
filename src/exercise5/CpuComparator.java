package exercise5;

import java.util.Comparator;

public class CpuComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer comp1, Computer comp2) {
        if(comp1 == null && comp2 == null)
            return 0;
        if(comp1 != null && comp2 == null)
            return -1;
        if(comp1 == null && comp2 != null)
            return 1;
        if(comp1.getCpu() > comp2.getCpu())
            return 1;
        else if(comp1.getCpu() < comp2.getCpu())
            return -1;
        else
            return 0;
    }
}
