
package ru.mail.ales_2003.convector.test;

import ru.mail.ales_2003.convector.convectorCompare.LenghtCompare;
import ru.mail.ales_2003.convector.convectorCompare.ReverceLenghtCompare;
import ru.mail.ales_2003.convector.convectorCompare.WidthCompare;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ru.mail.ales_2003.convector.business.ConvectorManager;
import ru.mail.ales_2003.convector.entity.Convector;

/**
 *
 * @author admin
 */


public class ConvectorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        ConvectorManager cm = new ConvectorManager();
        
        Convector c1 = new Convector(1000, 280, 75, 100, 200);
        Convector c2 = new Convector(2000, 280, 75, 195, 400);
        Convector c3 = new Convector(3000, 280, 75, 290, 600);
        Convector c4 = new Convector(1000, 220, 75, 95, 105);
        Convector c5 = new Convector(2000, 220, 100, 100, 107);
        Convector c6 = new Convector(1500, 280, 100, 110, 300);
 
        System.out.println("ADD CONVECTOR ============================");
        Long cId1 = cm.addConvector(c1);
        Long cId2 = cm.addConvector(c2);
        Long cId3 = cm.addConvector(c3);
        Long cId4 = cm.addConvector(c4);
        Long cId5 = cm.addConvector(c5);
        Long cId6 = cm.addConvector(c5);
        List<Convector> result1 = cm.findConvectors();
        for(Convector c : result1) {
            System.out.println(c);
        }
        
        System.out.println("UPDATE CONVECTOR ============================");
        Convector change = new Convector(cId1, 1000, 280, 100, 120,250);
        cm.updateConvector(change);
        List<Convector> result2 = cm.findConvectors();
        for(Convector c : result2) {
            System.out.println(c);
        }
        
        System.out.println("DELETE CONVECTOR ============================");
        cm.deleteConvector(cId2);
        List<Convector> result3 = cm.findConvectors();
        for(Convector c : result3) {
            System.out.println(c);
        }
     
 
        System.out.println("GET CONVECTOR ============================");
        Convector convector = cm.getConvector(cId5);
        System.out.println(convector);
        
        System.out.println("CONVECTOR ORDER BY LENGTH WITH INTERFACE COMPARABLE (METHOD COMPARETO) IN ARRAYLIST  ==============");
        Collections.sort(cm.findConvectors());
        List<Convector> result4 = cm.findConvectors();
        for(Convector c : result4) {
        System.out.println(c);
        }
        
        System.out.println("CONVECTOR ORDER BY LENGTH WITH COMPARATOR (METHOD COMPARE) IN ARRAYLIST  ==============");
        LenghtCompare lenghtComparator = new LenghtCompare();
        Collections.sort(cm.findConvectors(), lenghtComparator);
        List<Convector> result5 = cm.findConvectors();
        for(Convector c : result4) {
        System.out.println(c);
        }
        
        System.out.println("CONVECTOR REVERCE ORDER BY LENGTH WITH COMPARATOR (METHOD COMPARE) IN ARRAYLIST  ==============");
        ReverceLenghtCompare reverceLenghtComparator = new ReverceLenghtCompare();
        Collections.sort(cm.findConvectors(), reverceLenghtComparator);
        List<Convector> result6 = cm.findConvectors();
        for(Convector c : result4) {
        System.out.println(c);
        }
        
        System.out.println("CONVECTOR ORDER BY WIDTH WITH COMPARATOR (METHOD COMPARE) IN ARRAYLIST  ==============");
        WidthCompare widthComparator = new WidthCompare();
        Collections.sort(cm.findConvectors(), widthComparator);
        List<Convector> result7 = cm.findConvectors();
        for(Convector c : result4) {
        System.out.println(c);
        }
    }
}
