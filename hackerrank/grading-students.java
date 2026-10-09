// Problem: Grading Students
// Link: https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < grades.size(); i++) {
        int grade = grades.get(i);
        if (grade < 38) {
            ans.add(grade);
        } else if (grade % 5 == 0) {
            ans.add(grade);
        } else if ((grade + 1) % 5 == 0) {
            ans.add(grade + 1);
        } else if ((grade + 2) % 5 == 0) {
            ans.add(grade + 2);
        } else {
            ans.add(grade);
        }
    }
    return ans;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
