package com.taskmanager.personal_task_manager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Board {
    private int id;
    private String title;
    private String description;
    private int user_id;
}
