package src.OOPS_13;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

class ASC implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class DSC implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

class  sortByName implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class Student implements Comparable<Student>{

    Integer id;
    String name;

    public Student( Integer id, String name)
    {
        this.id=id;
        this.name= name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(@NotNull Student s2) {
        return Integer.compare(this.id, s2.id);
    }
}
