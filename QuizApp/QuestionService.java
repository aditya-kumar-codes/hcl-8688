import java.util.Scanner;

public class QuestionService {
    private final Question[] questions = new Question[5];
    private final String[] userAnswers = new String[5];

    public  QuestionService() {
        questions[0]=new Question(1,"What is the capital of India?","Delhi","Mumbai","Kolkata","Chennai","A");
        questions[1]=new Question(2,"What is the capital of USA?","Washington DC","New York","Los Angeles","Chicago","A");
        questions[2]=new Question(3,"What is the capital of UK?","London","Manchester","Birmingham","Liverpool","A");
        questions[3]=new Question(4,"What is the capital of France?","Paris","Lyon","Marseille","Toulouse","A");
        questions[4]=new Question(5,"What is the capital of Germany?","Berlin","Munich","Frankfurt","Hamburg","A");
    }
    public void displayQuestion(){
        int i=0;
        for(Question q:questions){
            System.out.println("Question no.: "+q.getId());
            System.out.println("Question: "+q.getQuestion());
            System.out.println("Option A: "+q.getOptionA()+" Option B: "+q.getOptionB()+" Option C: "+q.getOptionC()+" Option D: "+q.getOptionD());
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your answer: ");
            userAnswers[i]=sc.nextLine();
            i++;
        }
        int z=1;
        for(String s:userAnswers){
            System.out.println("Your answer for question "+z+" is: "+s);
            z++;
        }
    }

    public void printScore(){
        System.out.println("Your score is: " + calculateScore(userAnswers));
    }

    public Question[] getQuestions() {
        return questions.clone();
    }

    public int calculateScore(String[] answers) {
        if (answers == null || answers.length != questions.length) {
            throw new IllegalArgumentException("Exactly " + questions.length + " answers are required");
        }

        int score = 0;
        for(int i=0;i<questions.length ;i++)
        {
            String userAnswer = answers[i];
            if(userAnswer != null && userAnswer.equalsIgnoreCase(questions[i].getAnswer()))
            {
                score++;
            }
        }
        return score;
    }

}
