import java.util.HashMap;

public class iVoteSystem implements BaseSystem {
    private Question question;
    private HashMap<String,String> studentAnswersMap;

    public iVoteSystem(Question question) {
        this.question = question;
        studentAnswersMap = new HashMap<>();

    }

    @Override
    public void submission(iVoteSystemUser user) {
        if (studentAnswersMap.containsKey(user.getUserID())){
            System.out.println("Student #" + user.getUserID() + " answer has been updated.");
        }
        studentAnswersMap.put(user.getUserID(),user.getUserAnswer());
    }

    @Override
    public void runReport() {
        StudentResults results = new StudentResults(studentAnswersMap.values(), question.getCandidateAnswersArray());

    }





}
