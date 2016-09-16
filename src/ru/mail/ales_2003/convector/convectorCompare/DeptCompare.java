
package ru.mail.ales_2003.convector.convectorCompare;

import java.util.Comparator;
import ru.mail.ales_2003.convector.entity.Convector;

/**
 *
 * @author admin
 */
public class DeptCompare implements Comparator <Convector>{

    @Override
    public int compare(Convector c1, Convector c2) {
        return c1.getDept().compareTo(c2.getDept());
    }
    
}
