public class Dog extends Animal{

    public Dog(String name, String nickName, int age, int weight) {
        super(name, nickName, age, weight);
    }

    @Override
    public void raiseVoice() {
        System.out.println("Я " + this.name + " " + this.nickName + ", и мой голос это - Гав-Гав!");
    }

    public void toGuard (){
        System.out.println("Я охраняю!");
    }

    @Override
    public String toString() {
        return "Это " + this.name + ", по имени " + this.nickName + ". Ему " + this.age + " лет (года). Он весит " + this.weight
                + " килограмма";
    }
}

