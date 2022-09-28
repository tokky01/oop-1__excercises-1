int sqrt(int x){
  int i = 0;
  while(i < x){
  	if(i*i == x){
    	return i;
    }
  	i++;
  }
  return -1;
}