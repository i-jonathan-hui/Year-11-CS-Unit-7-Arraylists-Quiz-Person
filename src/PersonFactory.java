import java.util.*;

public class PersonFactory {
    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (allPersons.size() == 0) {
            allPersons.add(person);
            return;
        }

        int index = 0;
        for (int i=0; i<allPersons.size(); i++) {
            if (person.getLastName().compareTo(allPersons.get(i).getLastName()) < 0) {
                allPersons.add(index, person);
                break;
            }
            index++;
        }
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> allUnder18 = new ArrayList<>();
        for (int i=0; i<allPersons.size(); i++) {
            if (allPersons.get(i).getAge() < 18) allUnder18.add(allPersons.get(i));
        }
        return allUnder18;
    }

    public boolean checkLastName(String lastName) {
        for (int i=0; i<allPersons.size(); i++) {
            if (allPersons.get(i).getLastName().equals(lastName)) return true;
        }
        return false;
    }
}
