package javaoop.task01;

public class Yaojing {
    private String name;
    private String age;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showBasicInfo(){
        System.out.println("名字："+this.name);
        System.out.println("道行："+this.age);
        System.out.println("性别："+this.gender);
    }
    public void eatTangSeng(){
        System.out.println(this.name+"想吃唐僧");
    }
}
