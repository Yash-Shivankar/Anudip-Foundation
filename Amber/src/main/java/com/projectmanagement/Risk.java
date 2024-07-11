package com.projectmanagement;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "risks")
public class Risk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long riskId;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Column(nullable = false)
    private String description;

    private String impact;

    private String likelihood;

    @Column(name = "mitigation_plan")
    private String mitigationPlan;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    // Getters and Setters
}

