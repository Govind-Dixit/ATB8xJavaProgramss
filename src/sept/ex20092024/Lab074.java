package sept.ex20092024;

public class Lab074 {
    public static void main(String[] args) {

        // Grade Calculator
        // Write a program that calculates and displays
        //        the letter grade for a given numerical
        //        score (e.g., A, B, C, D, or F)
        //        based on the following grading scale:
        //        A: 90-100
        //        B: 80-89
        //        C: 70-79
        //        D: 60-69
        //        F: 0-59

        //   90 --> A
        //   87--> B
        //   23--> F
        //

        // 1.find the user input

        // score --> for data type of score you need to ask to the interviewer
        // score--> int score = 89;

        // return --> for data type of return you need to ask to the interviewer
        // return--> data type-- grade -- char

        //2. Basic logic
        // if score > =90 && score <=100 --> return or print A
        // else if score < =89 &&  score > =80 -> return or print B
        //else if score < =79 &&  score > =70 -> return or print c
        //else if score < =69 &&  score > =60 -> return or print D
        //else if score < =59 &&  score > =50 -> return or print E
        // Else print Grade "F"


        // 3. Write the code

        char grade = 'F';
        int Score = 85;// in the future we will get this form user by scaner class
        if (Score >= 90 && Score <= 100) {
            grade = 'A';

        } else if (Score >= 80 && Score <   = 89) {

            grade = 'B';

        } else if (Score >= 70 && Score <= 79) {
            grade = 'C';

        } else if (Score >= 60 && Score <= 69) {

        grade = 'D';

    }   else if (Score <= 0 || Score > 100) {
            System.out.println("LOL");
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is ->" +grade);
    }
    }


