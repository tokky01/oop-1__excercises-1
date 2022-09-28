int countZero(int[] array){
  int i = 0;
  int res = 0;
  while(i < array.length){
  	if(array[i] == 0){
      res++;
    }
  	i++;
  }
  return res;
}