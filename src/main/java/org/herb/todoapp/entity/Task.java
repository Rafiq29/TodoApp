package org.herb.todoapp.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String status;
    private String priority;
    private String description;
    private LocalDate date_created = LocalDate.now();
    private String due_date;
}
