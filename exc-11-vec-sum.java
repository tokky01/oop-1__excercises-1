class Vector{
  int x;
  int y;
}


Vector sum(Vector v1,Vector v2){
  Vector res = new Vector();
  res.x = v1.x + v2.x;
  res.y = v1.y + v2.y;
  return res;
}