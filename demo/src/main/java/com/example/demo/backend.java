package com.example.demo;



import java.time.LocalDate;

Public class Project extends Task{
    private string project_name;
    private LocalDate start_date;
    private LocalDate deadline;
    private string client_name;
    private string description;
    private string status;

}

Public class Task extends Subtask{
    private string task_name;
    private string task_specification;

    public string task_status;
    private LocalDate task_deadline;
    void change_task_status{



    }

}

Public class Subtask{
    private string subtask_name;
    private string subtask_specification;

    public string subtask_status;
    private LocalDate subtask_deadline;
    void change_subtask_status{



    }

}
