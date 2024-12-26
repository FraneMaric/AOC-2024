using System.ComponentModel;
using System.Text.RegularExpressions;

class Program
{
    static void Main(string[] args)
    {
        string input = File.ReadAllText("D:\\Programs\\AOC-2024\\AOC-2024\\Day3\\Day3\\Day3Input.txt");
        string pattern = @"do\(\)|don't\(\)|mul\((\d+),(\d+)\)";
        int result=0;
        bool isEnabled=true;

        MatchCollection matches = Regex.Matches(input, pattern);

        List<int> numbers = new List<int>();
        foreach (Match match in matches)
        {
            switch(match.Value){
            case "do()":
                isEnabled = true;
                break;
            case "don't()":
                isEnabled = false;
                break;
            default:
            {
                if (match.Value.StartsWith("mul") && isEnabled)
                {
                    numbers.Add(multiply(match.Value));
                }

                break;
            }
            }
        }
        
        foreach(int number in numbers){
            result+=number;
        }

        Console.WriteLine(result);
    }

    private static int multiply(string value)
    {
        int x,y;
        x=Convert.ToInt32(value.Substring(4,value.IndexOf(",")-4));
        y=Convert.ToInt32(value.Substring(value.IndexOf(",")+1,value.IndexOf(")")-value.IndexOf(",")-1));

        int result=x*y;
        return result;
    }
}