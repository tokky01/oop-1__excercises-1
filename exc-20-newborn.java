class Person{
  int age;
  Person nextOldestSibling; 
}

void addNewborn(Person person,Person newborn){
  Person youngerSibling = person.nextOldestSibling;
  boolean done = false;
  while(!done){
    if(youngerSibling.nextOldestSibling == null){
      youngerSibling.nextOldestSibling = newborn;
      done = true;
    }
    else{
      youngerSibling = youngerSibling.nextOldestSibling;
    }
    
  }
}