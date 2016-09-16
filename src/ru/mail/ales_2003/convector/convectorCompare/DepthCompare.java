package ru.mail.ales_2003.convector.convectorCompare;

import java.util.Comparator;
import ru.mail.ales_2003.convector.entity.Convector;

/**
 *
 * @author admin
 */
public class DepthCompare implements Comparator <Convector>{

    @Override
    public int compare(Convector c1, Convector c2) {
        return c1.getDepth().compareTo(c2.getDepth());
    }
    
}
