package com.microsrvice.Entrepreneur.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Setter
@Getter
@Table(name = "entrepreneure")
public class Entrepreneure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String number;
    private Long ideaCode;
}
