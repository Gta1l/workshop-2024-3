public class Student {
    private String name;
    private String surname;
    private int age;

    public Student(int age, String name, String surname) {
        if (age >= 15 & age < 120) {
            this.age = age;
        } else {
            throw new RuntimeException("Возраст должен быть от 15 до 120. Передан возраст: " + age);
        }
        setNamePrivate(name);
        if (surname.length() <= 3) {
            throw new RuntimeException("Длина фамилии должна быть не меньше четырёх символов. Передана фамилия: " + surname);
        } else {
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        setNamePrivate(name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private void setNamePrivate(String name){
        if (name.length() <= 3) {
            throw  new RuntimeException("Длина имени должна быть не меньше четырёх символов. Передано имя: " + name);
        } else {
            this.name = name;
        }
    }
}
