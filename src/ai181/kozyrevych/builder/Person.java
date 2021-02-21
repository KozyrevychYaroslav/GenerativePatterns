package ai181.kozyrevych.builder;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final int height;
    private final int weight;

    private Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }


    public static class Builder {
        private String name;
        private String surname;
        private int age;
        private int height;
        private int weight;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
