package my_task.one.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "panda")
public class Panda {

public Panda(){}

    public Panda(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;



}
