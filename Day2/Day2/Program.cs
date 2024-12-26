

class Program
{
    static void Main(string[] args)
    {
        string input = File.ReadAllText("D:\\Programs\\AOC-2024\\AOC-2024\\Day2\\Day2Inputs.txt");
        string[] lines = input.Split("\n");
        int result = 0;
        bool safe;
        Dictionary<string, bool>dic = new Dictionary<string, bool>();
        foreach (var line in lines)
        {
            dic.Add(line,false);
        }

        Console.WriteLine("There are " + result + " safe reports");
    }

    

    private static bool TestLine(string line)
    {
        try{
            string[] splitLine=line.Split(" ");
        int[] report=new int[10];
        for(int i=0;i<splitLine.Length;i++){
            report[i]=Int32.Parse(splitLine[i]);
        }
        Console.WriteLine(report[1]);
        return true;
        }catch(Exception e){
            Console.WriteLine(e);
        }
        return true;
    }




















    // private static int TestLine(string line)
    // {
    //     int counter = 0;    //Counter for safe reports
    //     bool safe;
    //     try
    //     {
    //         List<int> reports = new List<int>();

    //         foreach (var item in line.Split(" "))
    //         {
    //             reports.Add(int.Parse(item));
    //         }

    //         if (reports[1] - reports[0] <= 3 && reports[1] - reports[0] > 0)
    //         {
    //             safe = ReportsIncrease(reports);
    //             if (safe == true)
    //             {
    //                 counter++;
    //             }
    //         }
    //         else if (reports[0] - reports[1] <= 3 && reports[0] - reports[1] > 0)
    //         {
    //             safe = ReportsDecrease(reports);
    //             if (safe == true)
    //             {
    //                 counter++;
    //             }
    //         }
    //         else
    //         {
    //             //Not safe
    //         };
    //     }
    //     catch (Exception e)
    //     {
    //         Console.WriteLine(e);
    //     }

    //     return counter;
    // }

    // private static bool ReportsIncrease(List<int> reports)
    // {
    //     bool safe = true;
    //     for (int i = 0; i < reports.Count - 1; i++)
    //     {
    //         if (reports[i + 1] - reports[i] > 3 || reports[i + 1] - reports[i] <= 0)
    //         {
    //             safe = false;
    //         }
    //     }
    //     return safe;
    // }

    // private static bool ReportsDecrease(List<int> reports)
    // {
    //     bool safe = true;
    //     for (int i = 0; i < reports.Count - 1; i++)
    //     {
    //         if (reports[i] - reports[i + 1] > 3 || reports[i] - reports[i + 1] <= 0)
    //         {
    //             safe = false;
    //         }
    //     }
    //     return safe;
    // }
}