import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResettingFields {
    public static class Cat {
        private static String breed = "Persian";
        public String name;
        private int age;
        private List<String> friendsName;

        public Cat(String name, int age, List<String> friendsName) {
            this.name = name;
            this.age = age;
            this.friendsName = friendsName;
        }

        @Override
        public String toString() {
            return "Cat{name='" + name + "', age=" + age + ", friendsName=" + friendsName + "}";
        }
    }

    public static class Dog {
        public String nickname;
        private int weight;
        private String[] commands;

        public Dog(String nickname, int weight, String[] commands) {
            this.nickname = nickname;
            this.weight = weight;
            this.commands = commands;
        }

        @Override
        public String toString() {
            return "Dog{nickname='" + nickname + "', weight=" + weight + ", commands=" + Arrays.toString(commands) + "}";
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("Кот до: " + cat);
        nullifyFields(cat);
        System.out.println("Кот после: " + cat);
        System.out.println("---");
        Dog dog = new Dog("Sharik", 15, new String[]{"Sit", "Stay"});
        System.out.println("Пёс до: " + dog);
        nullifyFields(dog);
        System.out.println("Пёс после: " + dog);
    }

    public static void nullifyFields(Object obj) {
        if (obj == null) return;
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (!field.getType().isPrimitive()) {
                try {
                    field.setAccessible(true);
                    field.set(obj, null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}