package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.*;

public class People  {

    ArrayList<Person> personList = new ArrayList<Person>();

        public void add(Person person) {                                //method add

            personList.add(person);
        }



        public Person findById(long id){
            for(Person person: personList){
                if(person.getId() == id){
                    return person;
                }
            }
            return null;
        }

        public void remove(Person person){
             personList.remove(person);
        }

        public void remove(long id){
        for (int i=0; i < personList.size(); i++){
            if(personList.get(i).getId() == id)
                personList.remove(i);
        }
    }

        public int getCount() {
            return personList.size();
        }

        public Person[] getArray() {
            Person[] personArray = new Person[personList.size()];

         for (int i=0; i < personList.size(); i++) {
            personArray[i] = personList.get(i);

            }

        return personArray;
        }

        public void removeAll(){
            personList.removeAll(personList);
        }

}
