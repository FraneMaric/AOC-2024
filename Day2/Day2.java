import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Day2 day = new Day2();
        day.test(day.getList());
    }

    private void test(Map<Integer,ArrayList<Integer>> listOfList) {
        int result = 0;
        for(int b=0;b<listOfList.size();b++){
            boolean temp = true;
            ArrayList<Integer> list=new ArrayList<>();
            list=listOfList.get(b);
            if (list.get(0) < list.get(1)) {
                for (int i = 0; i < list.size(); i++) {
                    temp = true;
                    if ((list.get(i + 1) - list.get(i)) <= 3 && (list.get(i + 1) - list.get(i)) > 0) {
                    } else {
                        temp = false;
                        break;
                    }
                }
                if (temp == true) {
                    result++;
                }
            } else if (list.get(0) > list.get(1)) {
                temp = true;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == 94) {
                        System.out.println("Test");
                    }
                    if ((list.get(i) - list.get(i + 1)) <= 3 && (list.get(i) - list.get(i + 1)) > 0) {

                    } else {
                        temp = false;
                        break;
                    }
                }
                if (temp == true) {
                    result++;
                }

            } else {
                temp = false;
                break;
            }
        }
        System.out.println(result);
    }

    private Map getList() {
        Map map = new HashMap<Integer, ArrayList<Integer>>();
        try {
            File obj = new File("Day2Inputs.txt");
            Scanner myReader = new Scanner(obj);
            int i=0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] line = data.split(" ");
                ArrayList<Integer> temp=new ArrayList<>();
                for (int k = 0; k < line.length; k++) {
                    temp.add(Integer.parseInt(line[k]));
                }
                map.put(i, temp);
                i++;
            }
            myReader.close();
            return map;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return map;
        }
    }
}