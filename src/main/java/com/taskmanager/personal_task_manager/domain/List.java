package com.taskmanager.personal_task_manager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class List {
    private int id;
    private String title;
    private int board_id;
}
