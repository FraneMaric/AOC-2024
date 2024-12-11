import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part2
{
    public static void main(String[] args) {
        List<Integer> list1;
        List<Integer> list2;
        Part2 part2 = new Part2();
        list1 = part2.getList(0);
        list2 = part2.getList(1);
        part2.getResult(list1, list2);
    }

    private void getResult(List<Integer>list1,List<Integer>list2){
        int result=0;
        for(int i=0;i<list1.size();i++){
            int temp=0;
            for(int k=0;k<list2.size();k++){
                if(list1.get(i).equals(list2.get(k))){
                    temp++;
                }
            }
            result+=list1.get(i)*temp;
        }
        System.out.println(result);
    }

    private List<Integer> getList(int number) {
        List<Integer> result = new ArrayList<Integer>();
        try {
            File obj = new File("Day1Inputs.txt");
            Scanner myReader = new Scanner(obj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] temp;
                temp = data.split("  ");
                temp[1]=temp[1].replaceAll(" ", "");
                result.add(Integer.parseInt(temp[number]));
            }
            myReader.close();
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return result;
        }
    }
}
