class Person{
  int age;
  Person nextOldestSibling; 
}

void addNewborn(Person person,Person newborn){
  if(person.nextOldestSibling == null){
    person.nextOldestSibling = newborn;
  }else{
    addNewborn(person.nextOldestSibling,newborn);
  }
}