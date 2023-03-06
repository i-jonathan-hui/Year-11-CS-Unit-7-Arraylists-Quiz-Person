import java.util.*;

public class PersonFactory {
    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        for (int i=0; i<allPersons.size(); i++) {
            String currentLastName = allPersons.get(i).getLastName();
            if (person.getLastName().compareTo(currentLastName) == 0) {
                allPersons.add(i, person);
                break;
            }
            else if (person.getLastName().compareTo(currentLastName) < 0) {
                allPersons.add(i, person);
                break;
            }
        }
        if (allPersons.size() <= 1) allPersons.add(person);
        Collections.reverse(allPersons);
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
