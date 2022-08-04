package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@FieldDefaults(Level = AccessLevel.PRIVATE)
public class Student {
 private long rollNumber;
 private String studentName;
}
