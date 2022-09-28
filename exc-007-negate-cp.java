int[] negateCp(int[] array){
  int i = 0;
  int[] copy = new int[array.length];
  while(i < array.length){
  	copy[i] = -array[i];
  	i++;
  }
  return copy;
}