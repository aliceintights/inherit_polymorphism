import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldReturnAMatchForSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(7, "Купить молоко");

        boolean actual = simpleTask.matches("Купить молоко");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotReturnAMatchForSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(7, "Купить молоко");

        boolean actual = simpleTask.matches("Почистить снег");

        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldReturnAMatchForEpic() {
        String[] subtasks = {"Испечь пирог", "Полить цветы", "Прикрепить полку"};
        Epic epic = new Epic(9, subtasks);

        boolean actual = epic.matches("Прикрепить полку");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotReturnAMatchForEpic() {
        String[] subtasks = {"Испечь пирог", "Полить цветы", "Прикрепить полку"};
        Epic epic = new Epic(9, subtasks);

        boolean actual = epic.matches("Помыть окно");

        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldReturnAMatchForMeetingTopic() {
        Meeting meeting = new Meeting(
                15,
                "Литература XIX века",
                "Обучение",
                "Следующий понедельник"
        );

        boolean actual = meeting.matches("Литература XIX века");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnAMatchForMeetingProject() {
        Meeting meeting = new Meeting(
                15,
                "Литература XIX века",
                "Обучение",
                "Следующий понедельник"
        );

        boolean actual = meeting.matches("Обучение");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotReturnAMatchForMeeting() {
        Meeting meeting = new Meeting(
                15,
                "Литература XIX века",
                "Обучение",
                "Следующий понедельник"
        );

        boolean actual = meeting.matches("Коллоквиум по истории Латинских стран XX века");

        Assertions.assertFalse(actual);
    }
}
