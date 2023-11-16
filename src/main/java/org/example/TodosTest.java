package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TodosTest {

    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, "subtasks");

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSimpleTaskTitle() {
        SimpleTask simpleTask = new SimpleTask(7, "Купить молоко");

        Task[] expected = {simpleTask};
        Task[] actual = {simpleTask};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindEpic() {
        Epic epic = new Epic(9, "Прикрепить полку");
        String[] subtasks = {"Испечь пирог", "Полить цветы", "Прикрепить полку"};

        String[] expected = (subtasks);
        String[] actual = (subtasks);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMeeting() {
        Meeting meeting = new Meeting(
                15,
                "Литература XIX века",
                "Обучение",
                "Следующий понедельник"
        );
        Task[] expected = {meeting};
        Task[] actual = {meeting};

        Assertions.assertArrayEquals(expected, actual);
    }
}
