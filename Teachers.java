package lab1;

import java.time.LocalDate;
import java.util.Objects;


/**
 * class "Teachers" with fields: language, experience.
 * @author User
 * @version 1.0
 */
public class Teachers extends Students{
    private String language;
    private LocalDate dateOfEmployment;//

    public LocalDate getDateOfEmployment(){
        return dateOfEmployment;
    }
    public String getLanguage(){
        return language;
    }
    public void setDateOfEmployment(LocalDate dateOfEmployment){
        this.dateOfEmployment = dateOfEmployment;
    }
    public void setLanguage(String lang){
        this.language = lang;
    }

    /**
     * Class "Builder" with fields: teachers
     * @author User
     * @version 1.0
     */
    public static class Builder{
        private Teachers teachers;
        public Builder(){
            teachers = new Teachers();
        }

        /**
         * Setter  name designation
         * @param name - name of teacher
         * @return returns current object
         */
        public Builder setName(String name){
            teachers.name = name;
            return this;
        }

        /**
         * Setter  surname designation
         * @param surname - surname of teacher
         * @return returns current object
         */
        public Builder setSurname(String surname){
            teachers.surname = surname;
            return this;
        }

        /**
         * Setter  age designation
         * @param birthday - age of teacher
         * @return returns current object
         */
        public Builder setBirthday(LocalDate birthday){
            teachers.birthday = birthday;
            return this;
        }

        /**
         * Setter  languages designation
         * @param language - languages that teachers teach
         * @return returns current object
         */
        public Builder setLanguage(String language){
            teachers.language = language;
            return this;
        }

        /**
         * Setter  experience  designation
         * @param exp - teaching experience
         * @return returns current object
         */
        public Builder setDateOfEmployment(LocalDate exp){
            teachers.dateOfEmployment = exp;
            return this;
        }

        /**
         * Setter of creating an object of class "Teachers"
         * @return returns new object of class "Teachers"
         */
        public Teachers build(){
            return teachers;
        }
    }


    /**
     *  Overridden function of obtaining a string representation of
     *  an instance of a class "Teachers"
     *  @return returns the string representation
     */
    @Override
    public String toString(){
        return "Teachers: " +
                "Name = " + name + "; " +
                "Surname = " + surname + "; " +
                "Age = " + birthday + "; " +
                "Languages: = " + language + "; " +
                "DayOfEmployment: = " + dateOfEmployment + ";";
    }

    /**
     * Overridden function of comparison an instance of
     * the class "Teachers" and an instance of the class "Object"
     * @return returns the boolean value of the comparison
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Teachers s = (Teachers)obj;
        return name.equals(s.name) && surname.equals(s.surname) && birthday == s.birthday && language.equals(s.language) && dateOfEmployment == s.dateOfEmployment;
    }

    /**
     * Overridden function of obtaining the hash code
     * @return returns the numeric value of the hash code
     */
    @Override
    public int hashCode(){
        return Objects.hash(name, surname, birthday, language, dateOfEmployment);
    }

}
