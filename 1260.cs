using System;
using System.Collections;

public class Program
{
    private static int[,] matrix = new int[1001,1001];
    private static bool[] visits = new bool[1001];
    private static int N, M, V;
    
    static void Main(string[] args)
    {
        string input = Console.ReadLine()!;
        string[] NMV = input.Split(' '); // N M V
        N = Int32.Parse(NMV[0]);
        M = Int32.Parse(NMV[1]);
        V = Int32.Parse(NMV[2]);

        for (int i = 0; i < M; i++)
        {
            string line = Console.ReadLine()!;
            string[] numbers = line.Split(' ');
            int depart = Int32.Parse(numbers[0]);
            int arrive = Int32.Parse(numbers[1]);

            matrix[depart, arrive] = 1;
            matrix[arrive, depart] = 1;
        }

        dfs(V);
        Console.Write("\n");
        visits = new bool[1001];
        bfs(V);
    }

    private static void dfs(int startNumber){
        Console.Write($"{startNumber} ");
        visits[startNumber] = true;

        for (int i = 1; i <= N; i++)
        {
            if(visits[i] == true || matrix[startNumber, i] == 0) {
                continue;
            }
            dfs(i);
        }
    }

    private static void bfs(int startNumber){
        Queue<int> q = new Queue<int>();
        q.Enqueue(startNumber);
        visits[startNumber] = true;
        while(q.Count != 0){
            startNumber = q.Dequeue();
            Console.Write($"{startNumber} ");
            for (int i = 1; i <= N; i++)
            {
                if(visits[i]==true || matrix[startNumber, i] == 0) continue;
                
                q.Enqueue(i);
                visits[i] = true;
            }
        }
    }
}