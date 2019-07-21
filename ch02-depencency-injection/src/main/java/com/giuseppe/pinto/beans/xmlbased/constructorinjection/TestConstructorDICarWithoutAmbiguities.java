package com.giuseppe.pinto.beans.xmlbased.constructorinjection;

import com.giuseppe.pinto.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorDICarWithoutAmbiguities
{
  private static final String CONFIG_LOCATION = "beans-config-xmlbased.xml";

  public static void main(String[] args)
  {
    ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    Car car = (Car) context.getBean("constructorInjectionCarId");
    System.out.println(car.show());
  }
}