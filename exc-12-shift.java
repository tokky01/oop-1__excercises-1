class Vector{
  int x;
  int y;
}

void shift(Vector vector,Vector shift){
  vector.x = vector.x + shift.x;
  vector.y = vector.y + shift.y;
}