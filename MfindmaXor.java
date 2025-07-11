package Math;
public class findmaXor{
    public static int findmax = (int []nums){
        int maxor =0;
        int max=0;
        for(int i >= 31;i<n;i--){
            mask =(i<<i);
            set<Integer> set = new HashSet<>();
            for(int num:nums){
                set.add(num & mask);
            }
            int temp = maxor | (i<<1);
            boolean found = false;
            for(int prefix : set){
                if(set.contains(prefix^set)){
                    fount = true ;
                    break;
                }
            }
            if(found){
                maxor = temp
            }
        }
        return maxor;

    }

}