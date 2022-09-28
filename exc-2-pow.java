int pow(int x,int y){
  int res = 1;
  int i = 0;
  while(i<y){
    res = res * x;
    i++;
  }
  return res;
}