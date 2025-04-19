package com.quizapp2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer timeLimit;

  /* To do:
       1. DM  relationships with User;
       2. DM relationships with Question;
       3. Do I need a Timestamp or simplify?
       4. Good visual and logical understanding on what features I do need from User perspective;
       5. Before accepting DM -> this of scalability;
 */



}
