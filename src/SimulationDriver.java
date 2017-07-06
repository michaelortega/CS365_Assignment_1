import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class SimulationDriver {
    private Set<String> uniqueIDs;

    private String[] randAnswersArr;

    public Student[] getStudentObjArr() {
        return studentObjArr;
    }

    private Student[] studentObjArr;

    public SimulationDriver(Question question) {
        uniqueIDs = new HashSet<>();
        randAnswersArr = question.getCandidateAnswersArray();
        generateStudents();

    }

    public static void main(String[] args) {
        Question question1 = new MultipleChoiceQuestion("Which is the best way to solve this problem ", "A", "B", "C");
        SimulationDriver iVoteTest1 = new SimulationDriver(question1);
        iVoteSystem iVoteSystemTest1 = new iVoteSystem(question1);
        for (Student student : iVoteTest1.getStudentObjArr()) {
            iVoteSystemTest1.submission(student);
        }

        //Test update to a student that already answered
        Student randomStudent1 = iVoteTest1.getStudentObjArr()[new Random().nextInt(iVoteTest1.getStudentObjArr().length)];
        Student randomStudent2 = iVoteTest1.getStudentObjArr()[new Random().nextInt(iVoteTest1.getStudentObjArr().length)];
        randomStudent1.setAnswer(iVoteTest1.getRandomAnswer());
        randomStudent2.setAnswer(iVoteTest1.getRandomAnswer());
        iVoteSystemTest1.submission(randomStudent1);
        iVoteSystemTest1.submission(randomStudent2);

        iVoteSystemTest1.runReport();


        //*********************** TEST 2 ****************************
        System.out.println("\nTest 2");

        Question question2 = new SingleChoiceQuestion("There are 51 states in USA ", "True", "False");
        SimulationDriver iVoteTest2 = new SimulationDriver(question2);
        iVoteSystem iVoteSystemTest2 = new iVoteSystem(question2);
        for (Student student : iVoteTest2.getStudentObjArr()) {
            iVoteSystemTest2.submission(student);
        }

        //Test update to a student that already answered
        Student randomStudent3 = iVoteTest2.getStudentObjArr()[new Random().nextInt(iVoteTest2.getStudentObjArr().length)];
        Student randomStudent4 = iVoteTest2.getStudentObjArr()[new Random().nextInt(iVoteTest2.getStudentObjArr().length)];
        randomStudent3.setAnswer(iVoteTest2.getRandomAnswer());
        randomStudent4.setAnswer(iVoteTest2.getRandomAnswer());
        iVoteSystemTest2.submission(randomStudent3);
        iVoteSystemTest2.submission(randomStudent4);

        iVoteSystemTest2.runReport();


    }

    private void generateStudents() {
        int numberOfStudents = 1 + new Random().nextInt(50);
        System.out.println(numberOfStudents + " student(s) where generated");
        studentObjArr = new Student[numberOfStudents];
        for (int index = 0; index < studentObjArr.length; index++) {
            studentObjArr[index] = new Student(generateRandomID(), getRandomAnswer());
        }

    }

    private String generateRandomID() {
        String uuid;
        while (true) {
            uuid = UUID.randomUUID().toString();
            if (!uniqueIDs.contains(uuid)) {
                uniqueIDs.add(uuid);
                return uuid;
            }
        }
    }

    private String getRandomAnswer() {
        return randAnswersArr[new Random().nextInt(randAnswersArr.length)];
    }


}
