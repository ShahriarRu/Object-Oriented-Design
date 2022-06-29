public class Student extends Semester{
    private String registrationNo;
    private String Name;
    private boolean enrollStatus = false;

    public boolean enroll(String registrationNo,String Name){
        if(registrationNo != null && Name != null){
            this.enrollStatus = true;
        }
        return enrollStatus;
    }

}
