public class Solution {
    public int[] maxset(int[] A) {
        
        ArrayList<Integer> min_array=new ArrayList<Integer>();
        ArrayList<Integer> current_array=new ArrayList<Integer>();
        long max_sum=0,current_sum=0;
        int current_index=0,current_size=0,max_size=0;
        boolean first_pos=true,first_neg=false;

        while(current_index!=A.length){
            if(A[current_index]>=0){
                
                if(!first_neg){
                min_array.add(A[current_index]);
                max_sum+=A[current_index];
                ++max_size;
            }
                current_array.add(A[current_index]);
                current_sum+=A[current_index];
                ++current_size;
                first_pos=false;

            }else{
                if(!first_pos){
                    first_neg=true;
                }
                
                if(current_sum>=0){
                    if(max_sum<=current_sum){
                        
                        if(max_sum==current_sum){
                            
                            if(current_size>max_size){
                                max_sum=current_sum;
                                max_size=current_size;
                                min_array.clear();
                                min_array.addAll(current_array);
                            }
                        }else{
                                max_sum=current_sum;
                                max_size=current_size;
                                min_array.clear();
                                min_array.addAll(current_array);   
                        }
                    }
                }
                current_sum=0;
                current_size=0;
                current_array.clear();
                
            }
            ++current_index;
            
        }
        
        if(max_sum<=current_sum){
            if(max_sum==current_sum){
                if(max_size<current_size){
                    min_array.clear();
                    min_array.addAll(current_array);
                }
               }else{
                    min_array.clear();
                    min_array.addAll(current_array);
            }
           
        }
        
        return convertIntegers(min_array);
       
    }
    
    public static int[] convertIntegers(List<Integer> integers){
    int[] ret = new int[integers.size()];
    Iterator<Integer> iterator = integers.iterator();
    for (int i = 0; i < ret.length; i++)
    {
        ret[i] = iterator.next().intValue();
    }
        return ret;

    }
}
