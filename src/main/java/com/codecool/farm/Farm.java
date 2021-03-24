package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import com.codecool.farm.animal.Cattle;

import java.util.ArrayList;
import java.util.List;

class Farm {

    List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        animals.forEach(Animal::feed);
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> statusList = new ArrayList<>();
        for (Animal animal : animals) {
            String animalType = animal instanceof Cattle ? "cattle" : "pig";
            statusList.add("There is a " + animal.getSize() + " sized " + animalType + " in the farm.");
        }
        return statusList;
    }

}
