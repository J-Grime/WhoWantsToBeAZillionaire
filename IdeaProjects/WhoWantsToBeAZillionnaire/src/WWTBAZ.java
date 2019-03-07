import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by u1759958 on 01/03/2018.
 */
public class WWTBAZ {
    private JPanel mainpanel;
    private JPanel CentralGamePanel;
    private JPanel QScreen;
    private JLabel question;
    private JButton A_Answer;
    private JButton B_ANSWER;
    private JButton C_ANSWER;
    private JButton D_ANSWER;
    private JButton A_button;
    private JButton B_button;
    private JButton C_button;
    private JButton D_button;
    private JButton a5050Button;
    private JButton ATP_button;
    private JPanel title_Panel;
    private JPanel Help_Panel;
    private JButton sportsButton;
    private JButton musicButton;
    private JButton GKButton;
    private JLabel Player;
    private JButton startButton;
    private JButton submitButton;
    private String Q;
    private String A;
    private String B;
    private String C;
    private String D;
    private String correct;
    private String choice;
    private String chosenCategory;
    private String category;
    private String Question;
    private String ansA;
    private String ansB;
    private String ansC;
    private String ansD;
    private String correctAns;
    private String q;
    private String a;
    //creates instances
    QuestionPicker questionPicker = new QuestionPicker("","","","","","", "");
    Player player = new Player("",0,true,true,true);
    private int ChoiceCount = 1;
    private int user = 0;
    private int user0Total = 0;
    private int user1Total = 0;
    private boolean ATP1 = true;
    private boolean ATP2 = true;
    private boolean FF1 = true;
    private boolean FF2 = true;
    private String answer;





    public WWTBAZ() {
        ATP_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user == 0 && ATP1 == true){
                    JOptionPane.showMessageDialog(null, "The majority of the public have chosen:  "+ answer + "  as the correct answer");
                    ATP1 = false;
                }
                if (user == 1 && ATP2 == true){
                    JOptionPane.showMessageDialog(null, "The majority of the public have chosen:  "+ answer + "  as the correct answer");
                    ATP2 = false;
                }


            }
        });
        a5050Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = questionPicker.RandInt(0,4);//imports a random number
                System.out.println(num);
                if(user == 0 && FF1 == true){
                    if (answer != "A"){
                        if (num !=0 || num == 3){A_button.setVisible(false);}

                    }
                    if (answer != "B"){
                        if (num ==2 || num != 1){B_button.setVisible(false);}
                    }
                    if (answer != "C"){
                        if (num !=2 || num == 1){C_button.setVisible(false);}
                    }
                    if (answer != "D"){
                        if (num ==0 || num != 3){D_button.setVisible(false);}
                    }
                }

            }
        });
        A_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choice = "A";
                System.out.println(choice);
            }
        });
        B_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choice = "B";
                System.out.println(choice);
            }
        });
        C_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choice = "C";
                System.out.println(choice);
            }
        });
        D_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choice = "D";
                System.out.println(choice);
            }
        });
        sportsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ChoiceCount ==1) {
                    //gets the correct question randomly selected and displays the questions and answers
                    chosenCategory = "sports";
                    questionPicker.getQuestion("sports");
                    question.setText(questionPicker.twoString());
                    A_Answer.setText(questionPicker.A_string());
                    B_ANSWER.setText(questionPicker.B_string());
                    C_ANSWER.setText(questionPicker.C_string());
                    D_ANSWER.setText(questionPicker.D_string());
                    answer = questionPicker.correctAns_string();
                    System.out.println(" : " + questionPicker.toString());//testing
                    ChoiceCount = 0;//allows only one pick
                }
                else {
                    JOptionPane.showMessageDialog(null, "You have already chosen");
                }
            }
        });
        musicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ChoiceCount ==1) {
                    //gets the correct question randomly selected and displays the questions and answers
                    chosenCategory = "music";
                    questionPicker.getQuestion("music");
                    question.setText(questionPicker.twoString());
                    A_Answer.setText(questionPicker.A_string());
                    B_ANSWER.setText(questionPicker.B_string());
                    C_ANSWER.setText(questionPicker.C_string());
                    D_ANSWER.setText(questionPicker.D_string());
                    answer = questionPicker.correctAns_string();
                    System.out.println(" : " + questionPicker.toString());//testing
                    ChoiceCount = 0;//allows only one pick
                }
                else {
                    JOptionPane.showMessageDialog(null, "You have already chosen");
                }
            }
        });
        GKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ChoiceCount == 1) {
                    //gets the correct question randomly selected and displays the questions and answers
                    chosenCategory = "generalknowledge";
                    questionPicker.getQuestion("generalknowledge");
                    question.setText(questionPicker.twoString());
                    A_Answer.setText(questionPicker.A_string());
                    B_ANSWER.setText(questionPicker.B_string());
                    C_ANSWER.setText(questionPicker.C_string());
                    D_ANSWER.setText(questionPicker.D_string());
                    answer = questionPicker.correctAns_string();
                    System.out.println(" : " + questionPicker.toString());//testing
                    ChoiceCount = 0;//allows only one pick
                }
                else {
                    JOptionPane.showMessageDialog(null, "You have already chosen");
                }
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.Setup();
                Player.setText(player.getName(user).toString());
                questionPicker.QuestionsSetup();

                /*Player player1 = new Player("Player1",0,true,true,true);
                Player player2 = new Player("Player2",0,true,true,true);
                ArrayList<Player>players = new ArrayList<Player>();
                players.add(player1);
                players.add(player2);
                Player.setText(player1.toString());*/
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChoiceCount = 1;
                if (questionPicker.correctAns_string() == choice){
                    if (user == 0){ user0Total = user0Total + 100;//adds to total if correct
                    JOptionPane.showMessageDialog(null, "Correct" +" "+player.getName(user) +" "+ user0Total );
                    if(user0Total == 1000){
                        JOptionPane.showMessageDialog(null, "congrats, you win "+player.getName(user));
                        System.exit(0);//exits the game after checking if user has won
                    }
                    }
                    else {user1Total = user1Total + 100;//adds to total if correct
                        JOptionPane.showMessageDialog(null, "Correct" +" "+player.getName(user) +" "+ user1Total );
                        if(user1Total == 1000){
                            JOptionPane.showMessageDialog(null, "congrats, you win "+player.getName(user));
                            System.exit(0);//exits the game after checking if user has won

                        }
                    }
                    System.out.println(player.getTotal());


                }
                else {//notify if incorrect
                    JOptionPane.showMessageDialog(null, "incorrect" +" "+player.getName(user) +" "+ player.getTotal() );
                }
                if (user == 1){
                    user = 0;//sets to the next player
                    Player.setText(player.getName(user).toString());
                    JOptionPane.showMessageDialog(null, "please choose a category");
                }
                else{
                    user = 1;//sets to the next player
                    Player.setText(player.getName(user).toString());
                    JOptionPane.showMessageDialog(null, "please choose a category");
                }
                A_button.setVisible(true);//sets the buttons back to normal
                B_button.setVisible(true);
                C_button.setVisible(true);
                D_button.setVisible(true);
            }

        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Who Wants To Be A Zillionnaire");//sets the frame
        WWTBAZ wwbtaz = new WWTBAZ();
        frame.setContentPane(wwbtaz.mainpanel);


        //frame.setContentPane(new WWTBAZ().mainpanel);
        //WWTBAZ wwtbaz = new WWTBAZ();
        //JFrame.setContentPane(WWBTAZ);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        JPanel mainpanel = new JPanel();
        JPanel CentralGamePanel = new JPanel();
        JPanel QScreen = new JPanel();
        JTextArea question = new JTextArea();//uses all the gui components
        JLabel A_Answer = new JLabel();
        JLabel B_ANSWER = new JLabel();
        JLabel C_ANSWER= new JLabel();
        JLabel D_ANSWER = new JLabel();
        JButton A_button = new JButton();
        JButton B_button= new JButton();
        JButton C_button= new JButton();
        JButton D_button= new JButton();
        JButton a5050Button= new JButton();
        JButton ATP_button= new JButton();
        JPanel title_Panel = new JPanel();
        JPanel Help_Panel = new JPanel();
        JButton sportsButton= new JButton();
        JLabel Player = new JLabel();
        /*QuestionPicker question1 = new QuestionPicker("sports", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question2 = new QuestionPicker("music", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question3 = new QuestionPicker("film", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question4 = new QuestionPicker("sport", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question5 = new QuestionPicker("music", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question6 = new QuestionPicker("film", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        ArrayList<QuestionPicker> questions = new ArrayList<QuestionPicker>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        */

/*
        //array
        QuestionPicker question1 = new QuestionPicker("sport", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question2 = new QuestionPicker("music", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question3 = new QuestionPicker("film", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question4 = new QuestionPicker("sport", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question5 = new QuestionPicker("music", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        QuestionPicker question6 = new QuestionPicker("film", "asdasd", "dfssdf", "sfdds", "dfsfsd", "fsdfds", "d");
        ArrayList<QuestionPicker> questions = new ArrayList<QuestionPicker>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        Player player1 = new Player("Player1",0,true,true,true);
        Player player2 = new Player("Player2",0,true,true,true);
        ArrayList<Player>players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);

        String okay = players.get(1).toString();
        Player.setText(players.get(1).toString());

        //Iterator itr = questions.iterator();
        /*while(itr.hasNext()){
            QuestionPicker Question = (QuestionPicker) itr.next();
            System.out.println("Q:" + questions. );
            question.setText("hello");
        }
        */
        /*for(int x = 0; x<= questions.size() - 1; x++)
        {
            System.out.println(questions.get(x).toString());
            System.out.println(players.get(1).toString());
            System.out.println(players.get(2).toString());
        }*/
    }

}
