/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mail.ales_2003.convector.convectorCompare;

import java.util.Comparator;
import ru.mail.ales_2003.convector.entity.Convector;

/**
 *
 * @author admin
 */
public class LenghtCompare implements Comparator <Convector>{

    @Override
    public int compare(Convector c1, Convector c2) {
        return c1.getLength().compareTo(c2.getLength());
    }
    
}
