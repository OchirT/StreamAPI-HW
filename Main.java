import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> intList = new ArrayList<>();
        Arrays.sort(input);
        for (int x : input) {
            if (x <= 0) continue;
            if (x % 2 != 0) continue;
            intList.add(x);
        }
        System.out.println(intList);

    }

}

