/**
 * Created by Michael on 7/5/2017.
 */
public abstract class Question {
    private String question;
    private String[] candidateAnswersArray;


    public Question(String question, String[] candidateAnswersArray) {
        this.question = question;
        this.candidateAnswersArray = candidateAnswersArray;
    }

    public abstract void display();

    private void displayCandidateAnswers() {
        for (String canAns : candidateAnswersArray) {
            System.out.println(canAns + ".");
        }
    }


    public String getQuestion() {
        return question;
    }

    public String[] getCandidateAnswersArray() {
        return candidateAnswersArray;
    }
}
