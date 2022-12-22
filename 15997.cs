using System;

public class Program
{
    public class Question
    {
        public int number;
        public int strikes;
        public int balls;
    }

    static void Main(string[] args)
    {
        string questionCountInput = Console.ReadLine()!; //질문하는 횟수
        int questionCount = Int32.Parse(questionCountInput);

        List<Question> questions = new List<Question>();
        for (int i = 0; i < questionCount; i++)
        {
            string questionInput = Console.ReadLine()!; //질문하는 숫자 | strike | ball
            string[] arr = questionInput.Split(' ');

            Question question = new Question();
            question.number = Int32.Parse(arr[0]);
            question.strikes = Int32.Parse(arr[1]);
            question.balls = Int32.Parse(arr[2]);

            questions.Add(question);
        }

        // 123 ~ 987까지만 확인
        // 예외조건
        // 1. 0이 포함된 경우
        // 2. 같은 숫자가 2번 반복될 경우
        // 3. 제시된 질문과 s, b가 다를 경우
        List<int> answers = new List<int>();
        for (int i = 123; i < 988; i++)
        {
            Console.WriteLine($"It is {i}");
            int[] arr = getThreeDigit(i);

            // 1번 조건
            if(arr[0] == 0 || arr[1] == 0 || arr[2] == 0) {
                Console.WriteLine($"{i} is excluded By First Exception");
                continue;
            }

            // 2번 조건
            if(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
                Console.WriteLine($"{i} is excluded By Second Exception");
                continue;
            }

            // 3번 조건
            bool isCollect = true;
            for (int j = 0; j < questions.Count; j++)
            {
                if(!isMatchWithQuestion(i, questions[j])){
                    //하나라도 false가 나오면 제외
                    isCollect = false;
                    break;
                }
            }
            if(!isCollect) {
                Console.WriteLine($"{i} is excluded By Third Exception");
                continue;
            }

            // 정답에 가까운 숫자들
            answers.Add(i);
        }

        Console.WriteLine(answers.Count);
    }

    private static bool isMatchWithQuestion(int number, Question question)
    {
        // 세자리 비교
        int strikes, balls;
        strikes = 0;
        balls = 0;
        int[] digitsFromAnswer = getThreeDigit(number);
        int[] digitsFromQuestion = getThreeDigit(question.number);

        for (int i = 0; i < digitsFromAnswer.Length; i++)
        {
            for (int j = 0; j < digitsFromQuestion.Length; j++)
            {
                if(i == j && digitsFromAnswer[i] == digitsFromQuestion[j]){
                    strikes++;
                }
                else if (i != j && digitsFromAnswer[i] == digitsFromQuestion[j]){
                    balls++;
                }
            }
        }

        Console.WriteLine($"'{number}' : '{question.number}' is {strikes}Strikes and {balls}Balls");

        if(question.strikes == strikes && question.balls == balls){
            return true;
        }

        return false;
    }

    private static int[] getThreeDigit(int number){
        int[] arr = new int[3];
        arr[0] = number / 100;
        arr[1] = (number % 100) / 10;
        arr[2] = number % 10;

        return arr;
    }
}