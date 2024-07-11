package com.projectmanagement;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "task_resources")
@IdClass(TaskResourceId.class)
public class TaskResource {
    @Id
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Id
    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    // Getters and Setters
}

class TaskResourceId implements Serializable {
    private Long task;
    private Long resource;

    // Getters, Setters, hashCode, equals
}

