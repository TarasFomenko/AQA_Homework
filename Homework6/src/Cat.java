public class Cat extends Animal {
    public double jumpHeight;

    public Cat(String name, String nickName, int age, int weight, double jumpHeight) {
        super(name, nickName, age, weight);
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void raiseVoice() {
        System.out.println("Я " + this.name + " " + this.nickName + ", и мой голос это - Мяу-Мяу!");
    }
    public boolean catchTheBird(Bird bird) {
        if (bird.flightHeight <= this.jumpHeight){
            System.out.println(bird.nickName + " был пойман!");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Это " + this.name + ", по имени " + this.nickName + ". Ему " + this.age + " лет (года). Она весит " + this.weight
                + " килограмма и прыгает на высоту " + this.jumpHeight + " метров ";
    }
}





