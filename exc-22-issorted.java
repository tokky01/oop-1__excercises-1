boolean isSorted(int[] array){
  int i = 0;
  while(i < array.length){
  	if(i+1 == array.length){
   	  return true;
    }
    else{
      if(array[i] > array[i+1]){
        return false;
      }
    }
  	i++;
  }
  return false;
}