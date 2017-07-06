
public class Student implements iVoteSystemUser<String> {
    private String studentID;
    private String answer;

    public Student(String studentID, String answer) {
        this.studentID = studentID;
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
