import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleSolution{
    public static void main(String [] args){
        System.out.println(new PascalTriangleSolution().pascalTriangle(5));
    }

    public List<Integer> pascalTriangle(int rowIndex){
        int outerIndexVariable = rowIndex;
        if (outerIndexVariable == 0)
            return Arrays.asList(1);
        else if (outerIndexVariable == 1)
            return Arrays.asList(1, 1);
        else if (outerIndexVariable == 2)
            return Arrays.asList(1, 2, 1);
        List<Integer> result = new ArrayList<>();
        result.add(2);
        outerIndexVariable = outerIndexVariable - 2;
        int p, c;
        while (outerIndexVariable-- > 0) {
            p = 1;
            int innerIndexVariable = 0;
            for (int l = result.size(); innerIndexVariable < l; innerIndexVariable++) {
                c = result.get(innerIndexVariable);
                result.set(innerIndexVariable, p + c);
                p = c;
            }
            result.add(p + 1);
        }
        result.add(0, 1);
        result.add(1);
        return result;
    }
}