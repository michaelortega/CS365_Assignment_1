
public class Student implements iVoteSystemUser {
    private String studentID;
    private String answer;

    public Student(String studentID, String answer) {
        this.studentID = studentID;
        this.answer = answer;
    }


    //Used for testing purposes (updating answers to iVoteSystem)
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String getUserID() {
        return studentID;
    }

    @Override
    public String getUserAnswer() {
        return answer;
    }
}
