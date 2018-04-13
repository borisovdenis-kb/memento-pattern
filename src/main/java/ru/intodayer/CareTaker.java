package ru.intodayer;

import ru.intodayer.behavioral.memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> states;

    public CareTaker() {
        this.states = new ArrayList<>();
    }

    public Memento getMemento(Integer i) {
        return states.get(i);
    }

    public void addMemento(Memento memento) {
        this.states.add(memento);
    }
}
