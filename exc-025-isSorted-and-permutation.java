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

boolean isPermutation(int[] array, int[] target){
  int i = 0;
  while(i < array.length){
    int arrayOcurrences =  occurences(array,array[i]);
    int targetOcurrences =  occurences(target,array[i]);
    if(arrayOcurrences != targetOcurrences){
      return false;
    }
    i++;
  }
  return true;
}

boolean isSortedPermutation(int[] array, int[] target){
  return isPermutation(array,target) && isSorted(target);
} 