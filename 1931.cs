using System;

public class Program
{
    public class Meeting:IComparable<Meeting>{
        public int startTime;
        public int endTime;

        public int CompareTo(Meeting? other)
        {
            if(this.endTime > other.endTime){
                return 1;
            }
            else if (this.endTime == other.endTime){
                // 3
                // 3 4
                // 2 2
                // 0 2
                if(this.startTime > other.startTime){
                    return 1;
                }
                else if (this.startTime == other.startTime){
                    return 0;
                }
                else{
                    return -1;
                }
            }
            else{
                return -1;
            }
        }
    }

    static void Main(string[] args)
    {
        int meetingCount = Int32.Parse(Console.ReadLine()!);
        List<Meeting> meetingList = new List<Meeting>();
        for (int i = 0; i < meetingCount; i++)
        {
            int[] meetingTimeArr = Console.ReadLine().Split(' ').Select(x => Int32.Parse(x)).ToArray();
            Meeting meeting = new Meeting();
            meeting.startTime = meetingTimeArr[0];
            meeting.endTime = meetingTimeArr[1];

            meetingList.Add(meeting);
        }

        // 그리디 알고리즘에서는 기준을 잡고 정렬하는 것이 중요함.
        meetingList.Sort();

        int length = 1;
        int endtime = meetingList.First().endTime;

        for (int i = 1; i < meetingList.Count; i++)
        {
            // 앞선 회의의 종료시간 보다 일찍 시작하는 경우 제외
            if(endtime > meetingList[i].startTime) continue;
            
            // 뒷 타임 회의 종료시간으로 갱신
            endtime = meetingList[i].endTime;
            length++;
            //Console.Write($"({meetingList[i].startTime},{meetingList[i].endTime}) ");
        }

        Console.WriteLine($"{length}");
    }
}
