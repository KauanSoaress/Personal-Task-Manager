package com.taskmanager.personal_task_manager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Task {
    private int id;
    private String title;
    private String description;
    private Boolean isDone;
    private int list_id;
}
