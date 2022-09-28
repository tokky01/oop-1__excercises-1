int pow(int x,int y){
  if(y == 0){
  	return 1;
  }
  return pow(x,y-1)*x;
}