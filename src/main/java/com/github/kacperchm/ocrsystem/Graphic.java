package com.github.kacperchm.ocrsystem;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
public class Graphic {

    @GeneratedValue
    @Id
    private Long id;
    private String url;
    private String content;

}
