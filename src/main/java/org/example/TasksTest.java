package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldReturnMatchedForThreeTasks() {
        SimpleTask simpleTask = new SimpleTask(7, "Купить молоко");

        String[] subtasks = {"Испечь пирог", "Полить цветы", "Прикрепить полку"};
        Epic epic = new Epic(9, "Прикрепить полку");
        Meeting meeting = new Meeting(
                15,
                "Литература XIX века",
                "Обучение",
                "Следующий понедельник"
        );

        Task tasks = new Task(hashCode());

        tasks.matches(String.valueOf(simpleTask));
        tasks.matches(String.valueOf(epic));
        tasks.matches(String.valueOf(meeting));

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = {simpleTask, epic, meeting};

        Assertions.assertArrayEquals(expected, actual);
    }
}