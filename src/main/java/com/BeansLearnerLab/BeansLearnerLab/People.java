package com.BeansLearnerLab.BeansLearnerLab;

import java.util.*;

public abstract class People <PersonType extends Person> implements Iterable<PersonType> {

    private List<PersonType> list;


    public People(List<PersonType> list) {

        this.list = list;
    }

    public People(PersonType... persons ) {

        this(new ArrayList<>(Arrays.asList(persons)));

    }

    public void add(PersonType person) {

        list.add(person);

    }

    public void remove(PersonType person) {

        list.remove(person);

    }

    public int size() {

        return list.size();

    }

    public void clear() {

        list.clear();

    }

    public void addAll(Iterable<? extends PersonType> iterable) {

        iterable.forEach(person -> list.add(person));

    }

    public PersonType findById(Long id) {

        return list
                .stream()
                .filter(person -> Objects.equals(person.getId(), id))
                .findFirst()
                .get();
    }

    @Override
    public Iterator<PersonType> iterator() {

        return list.iterator();
    }

}
