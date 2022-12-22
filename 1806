using System;

public class Program
{
    static void Main(string[] args)
    {
        string NS = Console.ReadLine()!;
        int N = Int32.Parse(NS.Split(' ')[0]);
        int S = Int32.Parse(NS.Split(' ')[1]);

        string numbersString = Console.ReadLine()!;
        int[] numbers = new int[N];
        numbers = numbersString.Split(' ').Select(x=> Int32.Parse(x)).ToArray();
        
        int min = N+1;

        int start = 0;
        int end = 0;
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            start = end = i;
            sum = numbers[i];
            if(sum < S){
                while(end < N - 1){
                    end++;
                    sum += numbers[end];
                    if(sum >= S){
                        int newMin = end - start + 1;
                        if(min > newMin) min = newMin;
                        //Console.WriteLine($"start : {start}, end : {end}, sum : {sum}");
                        break;
                    }
                    else{
                        continue;
                    }
                }
            }else{
                min = 1;
            }            
        }
        

        Console.WriteLine((min == N+1)? 0 : min);
    }
}
