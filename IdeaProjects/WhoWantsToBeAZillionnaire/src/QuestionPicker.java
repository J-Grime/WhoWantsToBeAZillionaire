import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class QuestionPicker {
    private String category;
    private String Question;
    private String ansA;
    private String ansB;
    private String ansC;
    private String ansD;
    private String correctAns;
    private int c;
    ArrayList<QuestionPicker> sports = new ArrayList<QuestionPicker>();
    ArrayList<QuestionPicker> music = new ArrayList<QuestionPicker>();
    ArrayList<QuestionPicker> generalknowledge = new ArrayList<QuestionPicker>();//declares the arrays

    public int RandInt(int min, int max) {//random method for whenever it needs using
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + min) + min;
        return randomNum;
    }


    public QuestionPicker(String category, String question, String ansA, String ansB, String ansC, String ansD, String correctAns) {
        this.category = category;
        Question = question;
        this.ansA = ansA;
        this.ansB = ansB;
        this.ansC = ansC;
        this.ansD = ansD;
        this.correctAns = correctAns;

    }



    /*public void setup() {
        QuestionPicker question1 = new QuestionPicker("sports", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question2 = new QuestionPicker("music", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question3 = new QuestionPicker("film", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question4 = new QuestionPicker("sport", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question5 = new QuestionPicker("music", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question6 = new QuestionPicker("film", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        question.add(question1);
        question.add(question2);
        question.add(question3);
        question.add(question4);
        question.add(question5);
        question.add(question6);
    }
    */

    public void setQuestion(String category, String Question, String ansA, String ansB, String ansC, String ansD, String correctAns) {
        this.category = category;
        this.Question = Question;
        this.ansA = ansA;
        this.ansB = ansB;
        this.ansC = ansC;
        this.ansD = ansD;
        this.correctAns = correctAns;
    }
    public void QuestionsSetup(){
        //sets up the arraylists of questions
        QuestionPicker question1 = new QuestionPicker("sports", "Which club was famously called the noisy neighbours by A.Ferguson", "Man City", "Man United", "Wealdstone Raiders", "Milwall", "A");
        QuestionPicker question2 = new QuestionPicker("sports", "Which is the most famous goal in BPL history", "Bergkamp vs Newcastle","Aguero vs QPR" , "Walker vs Arsenal", "Beach ball vs Sunderland", "B");
        QuestionPicker question3 = new QuestionPicker("sports", "Which club has the highest player salary", "Man City", "Burnley", "Man united", "Chelsea", "C");
        QuestionPicker question4 = new QuestionPicker("sports", "Which club hasn't won a BPL title", "Chelsea", "Arsenal", "Man City", "Liverpool", "D");
        QuestionPicker question5 = new QuestionPicker("sports", "Which sport involves horses", "Horse Racing", "Findus", "Horse Dancing", "Fencing", "A");
        QuestionPicker question6 = new QuestionPicker("sports", "What is WWE", "Fake", "A sport", "A dodgy BMW", "Four stripe trainers", "B");
        sports.add(question1);
        sports.add(question2);
        sports.add(question3);
        sports.add(question4);
        sports.add(question5);
        sports.add(question6);
        QuestionPicker music1 = new QuestionPicker("music","Who wrote wonderwall?","Oasis","Blur","Pulp","Black Sabbath","A");
        QuestionPicker music2 = new QuestionPicker("music","Which singer died from aids?","David Bowie","Freddie Mercury","Globgogabgalab","Michael Jackson","B");
        QuestionPicker music3 = new QuestionPicker("music","Which was the original UK boy band?","Take That","Smash Mouth","The Beatles","Cabbage","C");
        QuestionPicker music4 = new QuestionPicker("music","Which band made grunge music mainstream?","The numpty showing this demo","Just Dave the god Grohl","Foo Fighter","Nirvana","D");
        QuestionPicker music5 = new QuestionPicker("music","Which band created the famous song We are the champions? ","Queen","FrogsForFrance","Rush","The Stantoners","A");
        QuestionPicker music6 = new QuestionPicker("music","Which City in the Uk is famous for it's indie scene?","Manchester","London","Birmingham","Newcastle","B");
        music.add(music1);
        music.add(music2);
        music.add(music3);
        music.add(music4);
        music.add(music5);
        music.add(music6);
        QuestionPicker gk1 = new QuestionPicker("general knowledge","Which Car brand is no longer British","Mini","BMW","Audi","Fiat","A");
        QuestionPicker gk2 = new QuestionPicker("general knowledge","Which tea is the best brand","Yorkshire","PG","Tetley","Bag","B");
        QuestionPicker gk3 = new QuestionPicker("general knowledge","Huddersfield has a famous...","cat","coffee shop","Church","Kebab shop","A");
        QuestionPicker gk4 = new QuestionPicker("general knowledge","What does Brexit mean?","British exit","breakfast","Brexit","next it","C");
        QuestionPicker gk5 = new QuestionPicker("general knowledge","Who has the best questions","Jacenta","Barry","Jim","Jack","D");
        QuestionPicker gk6 = new QuestionPicker("general knowledge","Complete the anthem : God save the ...","Beer","Queen","Deer","exew","B");
        generalknowledge.add(gk1);
        generalknowledge.add(gk2);
        generalknowledge.add(gk3);
        generalknowledge.add(gk4);
        generalknowledge.add(gk5);
        generalknowledge.add(gk6);
    }
    public String getQuestion(String chosenCategory) {



        //for (int i = 0; i <= sports.size() - 1; i++) {
                if (chosenCategory == "sports") {
                    c = RandInt(0,5);
                    Question = sports.get(c).twoString();

                    ansA = sports.get(c).A_string();
                    ansB = sports.get(c).B_string();
                    ansC = sports.get(c).C_string();
                    ansD = sports.get(c).D_string();
                    //System.out.println(sports.get(RandInt(0, 5)));
                    correctAns = sports.get(c).correctAns_string();
                    sports.remove(c);//returns the correct random question for the specific category and removes

                }

                if(chosenCategory == "music"){
                    c = RandInt(0,5);
                    Question = music.get(c).twoString();

                    ansA = music.get(c).A_string();
                    ansB = music.get(c).B_string();
                    ansC = music.get(c).C_string();
                    ansD = music.get(c).D_string();
                    correctAns = music.get(c).correctAns_string();
                    music.remove(c);//returns the correct random question for the specific category and removes
                }
            if(chosenCategory == "generalknowledge"){
                c = RandInt(0,5);
                Question = generalknowledge.get(c).twoString();

                ansA = generalknowledge.get(c).A_string();
                ansB = generalknowledge.get(c).B_string();
                ansC = generalknowledge.get(c).C_string();
                ansD = generalknowledge.get(c).D_string();
                correctAns = generalknowledge.get(c).correctAns_string();
                generalknowledge.remove(c);//returns the correct random question for the specific category and removes
                }

            //System.out.println(question.get());
        //}
        return Question;
    }

//below sets the appropriate to strings so they can be referenced in the other class for display
    public String twoString(){
        return Question;
    }
    public String B_string(){
        return ansB;
    }
    public String A_string(){
        return ansA;
    }
    public String C_string(){
        return ansC;
    }
    public String D_string(){
        return ansD;
    }
    public String correctAns_string(){
        return correctAns;
    }



    public String toString(){
        return "  "+category + "  " + Question + "  "+ansA + "  "+ansB + "  "+ansC + "  "+ansD + "  "+correctAns;
    }

    }


