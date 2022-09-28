class Person{
  int age;
  Person nextOldestSibling; 
}

int countYoungerSiblings(Person person){
  if(person.nextOldestSibling == null){
    return 0;
  }
  return countYoungerSiblings(person.nextOldestSibling) + 1;
}