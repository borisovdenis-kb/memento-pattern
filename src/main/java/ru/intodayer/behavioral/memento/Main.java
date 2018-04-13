package ru.intodayer.behavioral.memento;

import ru.intodayer.CareTaker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PersonOriginator personOriginator = new PersonOriginator();
        CareTaker careTaker = new CareTaker();

        personOriginator.setName("Denis");
        personOriginator.setAge(22);
        personOriginator.setGirlFriendsNames(Arrays.asList("Dasha", "Natasha"));
        careTaker.addMemento(personOriginator.saveState());

        personOriginator.setName("Denis");
        personOriginator.setAge(777);
        personOriginator.setGirlFriendsNames(Arrays.asList("Dasha", "Natasha"));
        careTaker.addMemento(personOriginator.saveState());

        personOriginator.setName("Denzel");
        personOriginator.setAge(50);
        personOriginator.setGirlFriendsNames(Arrays.asList("Dasha", "Natasha"));
        careTaker.addMemento(personOriginator.saveState());

        personOriginator.restoreState(careTaker.getMemento(1));
        System.out.println(personOriginator);

        personOriginator.restoreState(careTaker.getMemento(2));
        System.out.println(personOriginator);

    }
}
