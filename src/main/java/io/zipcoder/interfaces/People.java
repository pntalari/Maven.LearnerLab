package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(Long id) {
        Person person = null;
        for (Person per : personList
        ) {
            if (per.getId() == id) {
                person = per;
            }
        }
        return person;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(Long id) {
        Person person = findById(id);
        personList.remove(person);
    }

    public Integer getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        Person[] persons = new Person[personList.size()];
        return persons = personList.toArray(persons);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }


}
