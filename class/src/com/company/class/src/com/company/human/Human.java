package com.company.human;

public class Human {
        private String name;
        private int age;
        private String gender;
        private  int yearsOfBirth;

        public Human(String name, int age, String gender, int yearsOfBirth){
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.yearsOfBirth = yearsOfBirth;
        }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfBirth() {
        return yearsOfBirth;
    }

    public void setYearsOfBirth(int yearsOfBirth) {
        this.yearsOfBirth = yearsOfBirth;
    }
    public void view(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "My human is :"
                + name + "\n"
                +"Age: " +
                + age  + "\n"
                +"Gender : "
                + gender  + "\n"
                +"Birthday :"
                + yearsOfBirth;
    }
}
