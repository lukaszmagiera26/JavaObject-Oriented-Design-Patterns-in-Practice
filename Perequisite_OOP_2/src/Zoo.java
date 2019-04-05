public class Zoo {

    public static void main(String[] args) {

        /*Animal animal1 = new Animal(12, "M", 23);
        animal1.eat();

        Bird bird1 = new Bird(3, "F", 10);
        bird1.eat();
        bird1.sleep();*/

      /*  Chicken chick1 = new Chicken(1,"M", 7);
       chick1.fly();

        Sparrow sp = new Sparrow(1,"M", 8);
        sp.fly();*/

        Animal sparrow1 = new Sparrow(1, "M", 4);
        sparrow1.move();

        Animal fish1 = new Fish(1, "M", 2);
        fish1.move();

        moveAnimals(sparrow1);
        moveAnimals(fish1);

        Flyable flyingBird = new Sparrow(1, "M", 4);
        flyingBird.fly();
    }

        public static void moveAnimals(Animal animal){
            animal.move();
        }

}











