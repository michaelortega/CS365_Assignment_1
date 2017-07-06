import java.util.HashMap;

public class iVoteSystem implements BaseSystem {
    private Question question;
    private HashMap<String, String> studentAnswersMap;
    private StudentResults studentResults;


    public iVoteSystem(Question question) {
        this.question = question;
        studentAnswersMap = new HashMap<>();
        studentResults = new StudentResults(question.getCandidateAnswersArray());
    }

    @Override
    public void submission(iVoteSystemUser user) {
        if (studentAnswersMap.containsKey(user.getUserID())) {
            System.out.println("Student #" + user.getUserID() + " answer has been updated.");
        }
        studentResults.incrementAnswerFreq(user);
        studentAnswersMap.put(user.getUserID(), user.getUserAnswer());
    }

    @Override
    public void runReport() {
        studentResults.generateReport();
    }


}
