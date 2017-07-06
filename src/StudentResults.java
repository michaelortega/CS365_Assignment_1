import java.util.HashMap;
import java.util.Map;


public class StudentResults implements SubmissionResults {
    private HashMap<String, Integer> studentAnswerFrequency;


    public StudentResults(String[] candidateAnswers) {
        initAnswerCount(candidateAnswers);

    }

    private void initAnswerCount(String[] candidateAnswers) {
        studentAnswerFrequency = new HashMap<>();
        for (String ans : candidateAnswers) {
            studentAnswerFrequency.put(ans, 0);
        }
    }

    @Override
    public void generateReport() {
        for (Map.Entry<String, Integer> entry : studentAnswerFrequency.entrySet()) {
            System.out.printf("%s : %s \n", entry.getKey(), entry.getValue());

        }
    }

    @Override
    public void incrementAnswerFreq(iVoteSystemUser user) {
        studentAnswerFrequency.put(user.getUserAnswer(), studentAnswerFrequency.get(user.getUserAnswer()) + 1);
    }
}
