package ru.fertgl.db_connections.entities.ManyToMany.teacher_classroom;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "teaching_assignments")
public class TeachingAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private Integer hoursPerWeek;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "classroom_id", nullable = false)
    private Classroom classroom;
}