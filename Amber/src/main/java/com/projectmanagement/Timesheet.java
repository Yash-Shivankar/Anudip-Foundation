package com.projectmanagement;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "timesheets")
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timesheetId;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private Double hours;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    // Getters and Setters
}

