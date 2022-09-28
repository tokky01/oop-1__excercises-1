class Person{
  int age;
  Person nextOldestSibling; 
}

int countYoungerSiblings(Person person){
  Person youngerSibling = person.nextOldestSibling;
  int res = 0; 
  while(youngerSibling != null && youngerSibling.age > 18  ){
    youngerSibling = youngerSibling.nextOldestSibling;
    res++;
  }
  return res;
  
}