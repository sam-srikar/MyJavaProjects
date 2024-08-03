public class Student {
    private String name;
    private int age;
    private int money;


    public Student(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }


    public String isOld() {
        if (age % 2 == 0) {
            return "young";
        } else {
            return "old";
        }
    }


    public int getFavoriteNumber() {
        int sum = 0;
        int tempMoney = money;
        while (tempMoney > 0) {
            sum += tempMoney % 10;
            tempMoney /= 10;
        }
        return sum;
    }


    public String display() {
        return name + " is " + isOld() + ". Favorite number is " + getFavoriteNumber();
    }


    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 20, 123);
        Student student2 = new Student("Bob", 21, 456);
        Student student3 = new Student("Charlie", 22, 789);

      
        System.out.println(student1.display()); 
        System.out.println(student2.display()); 
        System.out.println(student3.display()); 
    }
}

