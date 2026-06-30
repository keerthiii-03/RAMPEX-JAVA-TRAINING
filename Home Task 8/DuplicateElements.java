public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {2,5,7,2,8,5,9,7,7};
        for(int i=0;i<arr.length;i++){
            boolean printed = false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k]){
                    printed = true;
                    break;
                }
            }
            if(printed)
                continue;
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>1){
                System.out.println(arr[i]);
            }
        }
    }
}