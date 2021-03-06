package designpattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by pmz on 2017/2/27 17:49.
 */
public abstract class AbstractSubject implements Subject{
    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
       Enumeration<Observer> enumo = vector.elements();
       while (enumo.hasMoreElements()){
           enumo.nextElement().update();
       }
    }

}
