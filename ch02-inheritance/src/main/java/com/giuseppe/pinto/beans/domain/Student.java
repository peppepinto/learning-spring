package com.giuseppe.pinto.beans.domain;

public class Student
{

  private int rollNumber;
  private String name;

  public int getRollNumber()
  {
    return rollNumber;
  }

  public void setRollNumber(int rollNumber)
  {
    this.rollNumber = rollNumber;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public String toString()
  {
    return "Student{" +
      "rollNumber=" + rollNumber +
      ", name='" + name + '\'' +
      '}';
  }
}
