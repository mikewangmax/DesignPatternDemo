package com.mike.designpattern.oowisedom.principle.information_hiding.example0;

import java.util.Date;

/**
 * principle content:
 *
 * for current class, it can only allow limited interface to others
 *
 * for other classes, these classes access by public interface,
 * each class do not know the implementation details of other classes
 *
 * allow current class to change the implementation without changing the expected outcome.
 *
 * the interface establishes the only assumptions you can rely on
 *
 * can prevent the critical attribute can be changed directly
 *
 * can use access modifier eg, private, public, protected, default
 *
 */
public class Student {
   private Date birthday;

   public Date getBirthday() {
       return this.birthday;
   }
}
