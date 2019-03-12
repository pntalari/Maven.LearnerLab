package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<E extends Person> {
    ArrayList<E> peopleList = new ArrayList<E>();

    public void add(E person) {
        peopleList.add(person);
    }

    public E findById(Long id) {
        E person = null;
        for (E per : peopleList
        ) {
            if (per.getId() == id) {
                person = per;
            }
        }
        return person;
    }

    public void remove(Person person) {
        peopleList.remove(person);
    }

    public void remove(Long id) {
        Person person = findById(id);
        peopleList.remove(person);
    }

    public Integer getCount() {
        return peopleList.size();
    }

    public E[] getArray() {
        E[] persons = (E[]) new Object[peopleList.size()];
        return persons = peopleList.toArray(persons);
    }

    public void removeAll(){
        peopleList.removeAll(peopleList);

    }


}
