public class Bird extends Animal {

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Flopping wings...");
    }

   // public void fly(){
    //   System.out.println("Flying...");
   // }



}