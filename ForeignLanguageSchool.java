package lab1;


import java.util.List;
import java.util.Objects;

/**
 * class "ForeignLanguageSchool" with fields: address, capacity, list of teachers.
 * @author User
 * @version 1.0
 */
public class ForeignLanguageSchool {
    private String address;
    private int capacity;
    private List<Teachers> teachers;

    public String getAddress(){
        return address;
    }

    public int getCapacity(){
        return capacity;
    }

    public List<Teachers> getTeachers(){
        return teachers;
    }


    /**
     * Class "Builder" with fields: school
     * @author User
     * @version 1.0
     */
    public static class Builder{
        private ForeignLanguageSchool school;

        public Builder(){
            school = new ForeignLanguageSchool();
        }

        /**
         * Setter  address designation
         * @param address - school address
         * @return returns current object
         */
        public Builder setAddress(String address){
            school.address = address;
            return this;
        }
        /**
         * Setter  capacity designation
         * @param cpt - capacity
         * @return returns current object
         */
        public Builder setCapacity(int cpt){
            school.capacity = cpt;
            return this;
        }
        /**
         * Setter  teachers designation
         * @param teachers - school teachers
         * @return returns current object
         */
        public Builder setTeachersList(List<Teachers> teachers){
            school.teachers = teachers;
            return this;
        }

        /**
         * Setter of creating an object of class "ForeignLanguageSchool"
         * @return returns new object of class "ForeignLanguageSchool"
         */
        public ForeignLanguageSchool build(){
            return school;
        }

    }

    /**
     *  Overridden function of obtaining a string representation of
     *  an instance of a class "ForeignLanguageSchool"
     *  @return returns the string representation
     */
    @Override
    public String toString(){
        return "Foreign language school: " +
                "Address = " + address +"; " +
                "Capacity = " + capacity + "; " +
                "Teachers = " + teachers +";";
    }


    /**
     * Overridden function of comparison an instance of
     * the class "ForeignLanguageSchool" and an instance of the class "Object"
     * @return returns the boolean value of the comparison
     */
    @Override
    public boolean equals(Object obj1){
        if(this == obj1){
            return true;
        }
        if (obj1 == null || this.getClass() != obj1.getClass()){
            return false;
        }

        ForeignLanguageSchool s = (ForeignLanguageSchool) obj1;
        return Objects.equals(address, s.address) && capacity == s.capacity;
    }


    /**
     * Overridden function of obtaining the hash code
     * @return returns the numeric value of the hash code
     */
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), address, capacity);
    }


}
