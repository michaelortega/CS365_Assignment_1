/**
 * Created by Michael on 7/5/2017.
 */
public class MultipleChoiceQuestion extends Question {


    public MultipleChoiceQuestion(String question, String... candidateAnswersArray) {
        super(question, candidateAnswersArray);
    }

    @Override
    public void display() {
        System.out.println(super.getQuestion());
        for (String candAns : super.getCandidateAnswersArray()) {
            System.out.println(candAns + ".");
        }
    }

}
