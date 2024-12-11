import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Part1 {
    public static void main(String args[]) {
        List<Integer> list1;
        List<Integer> list2;
        List<Integer> difference;
        Part1 part1 = new Part1();
        list1 = part1.getList(0);
        list2 = part1.getList(1);
        difference = part1.getDifference(list1, list2);
        part1.result(difference);
    }

    private List<Integer> getDifference(List<Integer> list1, List<Integer> list2) {
        List<Integer> difference = new ArrayList<Integer>();

        System.out.println("List 1 has " + list1.size() + " locations");
        System.out.println("List 2 has " + list2.size() + " locations");

        for (int i = 0; i < list1.size(); i++) {
            difference.add(list2.get(i) - list1.get(i));
        }
        return difference;
    }

    private void result(List<Integer> difference) {
        int result = 0;
        for (int i = 0; i < difference.size(); i++) {
            result = result + Math.abs(difference.get(i));
        }
        System.out.println("The result is: "+result);
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
            Collections.sort(result);
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return result;
        }
    }
}
