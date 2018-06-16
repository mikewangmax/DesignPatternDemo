package com.mike.designpattern.oowisedom.Inheritance_mistakes.is_a_role_of;

/**
 *
 * if there are many roles are presented as the subclass of their parent,
 *
 * be careful.
 *
 * for example, student and staff is the two roles of person, we need to separate concerns.
 *
 * we can use two class Student and Staff without inheritating the person.
 *
 */
public class Admin extends Staff {
}
