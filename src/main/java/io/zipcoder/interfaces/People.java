package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People<E extends Person> {
    ArrayList<Person> peopleList = new ArrayList<Person>();

    public void add(Person person) {
        peopleList.add(person);
    }

    public Person findById(Long id) {
        Person person = null;
        for (Person per : peopleList
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

    public Person[] getArray() {
        Person[] persons = new Person[peopleList.size()];
        return persons = peopleList.toArray(persons);
    }

    public void removeAll(){
        peopleList.removeAll(peopleList);

    }


}
