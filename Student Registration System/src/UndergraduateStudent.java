public class UndergraduateStudent extends Student {
    private String studentStatus;
    public String update(){
        this.studentStatus = "Under Graduate";
        return studentStatus;
    }
}
