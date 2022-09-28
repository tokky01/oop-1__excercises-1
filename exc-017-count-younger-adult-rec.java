class Person{
  int age;
  Person nextOldestSibling; 
}

int countYoungerSiblings(Person person){
  if(person.nextOldestSibling == null || youngerSibling.age < 18){
    return 0;
  }
  return countYoungerSiblings(person.nextOldestSibling) + 1;
}