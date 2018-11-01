package net.proselyte.basepatterns.behavioral.iterator;

public class PersonRunner {
    public static void main(String[] args) {
        String skills[] = {"Write", "Read", "Speak", "Go", "Eat", "Sleep" };

        Person person = new Person("Vladislav Kutsobin", skills);

        Iterator iterator = person.getIterator();
        System.out.println("Person: " + person.getName());

        System.out.print("Skills: ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString() + "; ");
        }
    }
}
