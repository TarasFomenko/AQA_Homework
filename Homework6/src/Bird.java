public class Bird extends Animal {
    public double flightHeight;

    public Bird(String name, String nickName, int age, int weight, double flightHeight) {
        super(name, nickName, age, weight);
        this.flightHeight = flightHeight;
    }

    @Override
    public void raiseVoice() {
        System.out.println("Я " + this.name + " " + this.nickName + ", и мой голос это - Курлык-Курлык!");
    }

    public void toFlight() {
        if (this.flightHeight > 1) {
            System.out.println(this.nickName + " - высоко летающая птица");
        } else {
            System.out.println(this.nickName + " - низко летающая птица");
        }
    }

    @Override
    public String toString() {
        return "Это " + this.name + ", по имени " + this.nickName + ". Ему " + this.age + " лет (года). Он весит " + this.weight
                + " килограмма и летает на высоте " + this.flightHeight + " метров ";
    }
}




