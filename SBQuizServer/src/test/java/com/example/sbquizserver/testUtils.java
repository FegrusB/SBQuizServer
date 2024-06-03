package com.example.sbquizserver;

import com.example.sbquizserver.models.Answer;
import com.example.sbquizserver.models.Question;
import com.example.sbquizserver.models.Quiz;

import java.util.ArrayList;
import java.util.List;

public class testUtils {


    public static final ArrayList<Quiz> QUIZZES = new ArrayList<>(List.of(
            new Quiz(0, "History", "A short quiz on general history."),
            new Quiz(1, "Bits and Bytes", "A short quiz about basic data quantities")
    ));

    public static final ArrayList<Question> QUESTIONS = new ArrayList<>(List.of(
            new Question(0, 0, "What year was The Battle of Hastings?"),
            new Question(1, 0, "How many different wives did Henry VIII have?"),
            new Question(2, 1, "What values can a bit hold?"),
            new Question(3, 1, "How many bits make a nibble?"),
            new Question(4, 1, "How many bits are there in a byte?"),
            new Question(5, 1, "What is the biggest value a byte can hold?"),
            new Question(6, 1, "1024 bytes equals what?")
    ));

    public static final ArrayList<Answer> ANSWERS = new ArrayList<>(List.of(
            new Answer(0, 0, "1066", true),
            new Answer(1, 0, "1939", false),
            new Answer(2, 0, "45", false),
            new Answer(3, 0, "1010", false),
            new Answer(4, 1, "6", true),
            new Answer(5, 1, "0", false),
            new Answer(6, 1, "64", false),
            new Answer(7, 1, "8", false),
            new Answer(8, 2, "1 0r 0", true),
            new Answer(9, 2, "Only 7", false),
            new Answer(10, 2, "Anything from one to 10", false),
            new Answer(11, 2, "No value at all", false),
            new Answer(12, 3, "4", true),
            new Answer(13, 3, "A half", false),
            new Answer(14, 3, "7", false),
            new Answer(15, 3, "64", false),
            new Answer(16, 4, "8", true),
            new Answer(17, 4, "64", false),
            new Answer(18, 4, "128", false),
            new Answer(19, 4, "1024", false),
            new Answer(20, 5, "255", true),
            new Answer(21, 5, "10000000", false),
            new Answer(22, 5, "42", false),
            new Answer(23, 5, "256", false),
            new Answer(24, 6, "1 KiloByte", true),
            new Answer(25, 6, "1 GigaByte", false),
            new Answer(26, 6, "4 KiloBytes", false),
            new Answer(27, 6, "1 Elephant", false)
    ));
}
