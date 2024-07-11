package com.projectmanagement;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "resources")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resourceId;

    @Column(nullable = false)
    private String name;

    private String type;

    private Boolean available;

    @ManyToMany(mappedBy = "resources")
    private List<Task> tasks;

    // Getters and Setters
}
