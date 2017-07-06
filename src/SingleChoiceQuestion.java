/**
 * Created by Michael on 7/5/2017.
 */
public class SingleChoiceQuestion extends Question {


    public SingleChoiceQuestion(String question, String candidateAnswer1, String candidateAnswer2) {
        this(question, candidateAnswersToArr(candidateAnswer1, candidateAnswer2));
    }

    private SingleChoiceQuestion(String question, String[] candidateAnswersArr) {
        super(question, candidateAnswersArr);
    }

    @Override
    public void display() {
        System.out.println(super.getQuestion());
        String[] candidateAnswersArr = super.getCandidateAnswersArray();
        System.out.println("Please select only one answer: " + candidateAnswersArr[0] + " OR " + candidateAnswersArr[1]);
    }


    private static String[]candidateAnswersToArr(String candidateAnswer1, String candidateAnswer2) {
        return new String[]{candidateAnswer1, candidateAnswer2};
    }

}
