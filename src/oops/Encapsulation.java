package oops;

    public class Encapsulation {
    private String firstName= "Gorge";
    private String lastName= "Odom";
    private int age=21;
    private long ssn= 436283565;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public long getSsn() {
            return ssn;
        }

        public void setSsn(long ssn) {
            this.ssn = ssn;
        }
//    public String getFirstName(){
//        return firstName;
//    }
//
//    public void setFirstName(String firstName){
//        this.firstName=firstName;
//    }

}
