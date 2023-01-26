package boot.bean;


/**
 * @author LiGuanda
 * @date 2023/1/19 上午 10:07:13
 * @description no description right now...
 * @filename Student.java
 */

public class Student {


    private int id;
    private String name;
    private String occupation;
    private int score;


    public Student() {


    }


    public Student(int id, String name, String occupation, int score) {

        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.score = score;

    }


    public void setId(int id) {

        this.id = id;

    }


    public void setName(String name) {

        this.name = name;

    }


    public void setOccupation(String occupation) {

        this.occupation = occupation;

    }


    public void setScore(int score) {

        this.score = score;

    }


    public int getId() {

        return id;

    }


    public String getName() {

        return name;

    }


    public String getOccupation() {

        return occupation;

    }


    public int getScore() {

        return score;

    }


    @Override
    public String toString() {

        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", score=" + score +
                '}';

    }


}
