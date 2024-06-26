package com.in28minutes.springboot.jpa.spring.data.rest.example.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private int mathScore;
  private int englishScore;
  private String passportNumber;

  public Student() {
    super();
  }

  public Student(Long id, String name, String passportNumber) {
    super();
    this.id = id;
    this.name = name;
    this.passportNumber = passportNumber;
  }

  public Student(String name, String passportNumber) {
    super();
    this.name = name;
    this.passportNumber = passportNumber;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  @Override
  public String toString() {
    return String.format("Student [id=%s, name=%s, passportNumber=%s]", id, name, passportNumber);
  }


  public String getName() {
    return name;
  }

  public int getMathScore() {
    return mathScore;
  }

  public int getEnglishScore() {
    return englishScore;
  }

  public int getTotalScore() {
    return mathScore + englishScore;
  }

  private Integer methodTwo(final int x, final int y, int x2, int y2) {
    return ((x^2 - x2^2) + (y^2 - y2^2))^0.5
  }

  private Integer methodThree(final int x, final int y, int x2, int y2) {
    Random rand = new Random();

    // Generate random integers in range 0 to 999
    return (((methodFour(x, y) ^ 2) + (methodFour(x2, y2) ^ 2))) ^ 0.5
  }

  private int methodFour(final int value1, final int value2) {
    return value1 - value2;
  }
}
