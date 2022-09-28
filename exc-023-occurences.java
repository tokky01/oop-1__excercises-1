int occurences(int[] array,int value){
  int i = 0;
  int res = 0;
  while(i < array.length){
    if(array[i] == value){
      res++;
    }
    i++;
  }
  return res;
}