package lab1;

import java.time.LocalDate;
import java.util.Objects;

/**
 * class "Students" with fields: name, surname, age.
 * @author User
 * @version 1.0
 */
public class Students {
    protected String name;
    protected String surname;
    protected LocalDate birthday;
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public LocalDate getBirthday(){
        return birthday;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setBirthday(LocalDate birthday){
        this.birthday = birthday;
    }

    /**
     * Class "Builder" with fields: student
     * @author User
     * @version 1.0
     */
    public static class Builder{
        private Students student;
        public Builder(){
            student = new Students();
        }

        /**
         * Setter name designation
         * @param name - name of student
         * @return returns current object
         */
        public Builder setName(String name){
            student.name = name;
            return this;
        }
        /**
         * Setter  surname designation
         * @param surname - surname of student
         * @return returns current object
         */
        public Builder setSurname(String surname){
            student.surname = surname;
            return this;
        }
        /**
         * Setter  age designation
         * @param birthday - age of student
         * @return returns current object
         */
        public Builder setBirthday(LocalDate birthday){
            student.birthday = birthday;
            return this;
        }

        /**
         * Setter of creating an object of class "Students"
         * @return returns new object of class "Students"
         */
        public Students build(){
            return student;
        }
    }


    /**
     *  Overridden function of obtaining a string representation of
     *  an instance of a class "Students"
     *  @return returns the string representation
     */
    @Override
    public String toString() {
        return "Students: " +
                "Name = " + name + "; " +
                "Surname = " + surname + "; " +
                "Birthday = " + birthday + ";";
    }


    /**
     * Overridden function of comparison an instance of
     * the class "Students" and an instance of the class "Object"
     * @return returns the boolean value of the comparison
     */
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Students s = (Students) obj;
        return name.equals(s.name) && surname.equals(s.surname) && birthday == s.birthday;

    }

    /**
     * Overridden function of obtaining the hash code
     * @return returns the numeric value of the hash code
     */
    @Override
    public int hashCode(){
        return Objects.hash(name, surname, birthday);
    }



}
