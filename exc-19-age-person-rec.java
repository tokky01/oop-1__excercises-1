class Person{
  int age;
  Person nextOldestSibling; 
}

void age(Person person){
  person.age++;
  if(person.nextOldestSibling != null){
    age(person.nextOldestSibling);
  }
}