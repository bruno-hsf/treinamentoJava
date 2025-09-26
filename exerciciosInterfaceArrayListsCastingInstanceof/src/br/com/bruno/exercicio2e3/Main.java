package br.com.bruno.exercicio2e3;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        //casting para classe animal, ou seja, trate esse cachorro como um animal
        Animal animal = (Animal) cachorro;

        if(animal instanceof Cachorro){
            //se *animal* for uma intancia de cachorro, trate esse animal como um cachorro
            Cachorro dog = (Cachorro) animal;
            dog.abanarRabo();
        } else {
            animal.emitirSom();
        }
    }
}
