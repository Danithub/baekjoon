using System;

public class Program
{
    public class Case{
        public int indexToFind;
        public Queue<Document> docuQueue;
    }

    public class Document:IComparable<Document>{
        public int initialIndex;
        public int importance;

        public int CompareTo(Document? other)
        {
            if(this.importance > other!.importance)
                return 1;
            else if (this.importance == other.importance)
                return 0;
            else
                return -1;
        }
    }

    static void Main(string[] args)
    {
        string testCaseCountInput = Console.ReadLine()!; 
        int testCaseCount = Int16.Parse(testCaseCountInput);

        List<Case> testCaseList = new List<Case>();
        for (int i = 0; i < testCaseCount; i++)
        {
            string DocuCountAndCurrentIndexInput = Console.ReadLine()!;
            string[] arr = DocuCountAndCurrentIndexInput.Split(' ');
            int currentIndex = Int16.Parse(arr[1]);

            string docuListInput = Console.ReadLine()!;
            arr = docuListInput.Split(' ');

            Case testCase = new Case();
            testCase.indexToFind = currentIndex;
            testCase.docuQueue = new Queue<Document>();
            for (int j = 0; j < arr.Length; j++)
            {
                Document document = new Document();
                document.initialIndex = j;
                document.importance = Int16.Parse(arr[j]);    

                testCase.docuQueue.Enqueue(document);
            }

            testCaseList.Add(testCase);
        }

        for (int i = 0; i < testCaseList.Count; i++)
        {
            Case currentCase = testCaseList[i];

            int printIndex = 0;
            while(currentCase.docuQueue.Count != 0)
            {
                Document printDocument = currentCase.docuQueue.Peek();
                //Console.WriteLine($"max = {currentCase.docuQueue.Max().importance}"
                //                    +$", current = {printDocument.importance}");
                if(currentCase.docuQueue.Max().importance == printDocument.importance){                    
                    if(currentCase.indexToFind == printDocument.initialIndex){
                        Console.WriteLine($"{++printIndex}");
                        break;
                    }
                    else{
                        currentCase.docuQueue.Dequeue();
                        printIndex++;
                        continue;
                    }
                }
                else{
                    currentCase.docuQueue.Dequeue();
                    currentCase.docuQueue.Enqueue(printDocument);
                }
            }
        }
    }
}
