public class Animal {
    public String name;
    public String nickName;
    public int age;
    public int weight;

    public Animal(String name, String nickName, int age, int weight) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
    }

    public void raiseVoice() {
        System.out.println("Подать голос!");
    }
}