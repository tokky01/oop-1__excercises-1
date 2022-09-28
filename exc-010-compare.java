class Vector{
  int x;
  int y;
}

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

int magnitude(Vector vector){
  int x = vector.x;
  int y = vector.y;
  return sqrt(x*x+y*y);
}

int compare(Vector vector,Vector comparedVector){
  int magnitude = magnitude(vector);
  int comparedMagnitude = magnitude(comparedVector);
  if(magnitude > comparedMagnitude){
  	return 1;
  }
  if(magnitude == comparedMagnitude){
  	return 0;
  }
  if(magnitude < comparedMagnitude){
  	return -1;
  }
}