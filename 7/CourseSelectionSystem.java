import java.util.ArrayList;
import java.util.List;

public class CourseSelectionSystem {

    public static String process(String[] commands) {
        List<String> courses = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        for (String command : commands) {

            if (command.startsWith("add ")) {
                String courseName = command.substring(4);

                if (containsCourse(courses, courseName)) {
                    appendLine(output, "Course already exists");
                } else {
                    courses.add(courseName);
                }

            } else if (command.startsWith("remove ")) {
                String courseName = command.substring(7);

                int index = findCourseIndex(courses, courseName);

                if (index == -1) {
                    appendLine(output, "Course not found");
                } else {
                    courses.remove(index);
                }

            } else if (command.equals("list")) {

                if (courses.isEmpty()) {
                    appendLine(output, "No courses");
                } else {
                    appendLine(output, String.join(", ", courses));
                }
            }
        }

        return output.toString();
    }

    private static boolean containsCourse(List<String> courses, String courseName) {
        for (String course : courses) {
            if (course.equalsIgnoreCase(courseName)) {
                return true;
            }
        }
        return false;
    }

    private static int findCourseIndex(List<String> courses, String courseName) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equalsIgnoreCase(courseName)) {
                return i;
            }
        }
        return -1;
    }

    private static void appendLine(StringBuilder output, String text) {
        if (output.length() > 0) {
            output.append("\n");
        }
        output.append(text);
    }
}