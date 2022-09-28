int[] negate(int[] array){
  int i = 0;
  while(i < array.length){
  	array[i] = -array[i];
  	i++;
  }
  return array;
}