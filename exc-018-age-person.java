class Person{
  int age;
  Person nextOldestSibling; 
}

void age(Person person){
  person.age++;
  Person youngerSibling = person.nextOldestSibling;
  boolean done = false;
  while(youngerSibling != null){
    youngerSibling.age++;
    youngerSibling = youngerSibling.nextOldestSibling;
  } 
}