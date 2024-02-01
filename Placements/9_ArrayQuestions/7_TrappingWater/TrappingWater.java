public class TrappingWater {
    public static int trappedWater(int height[]){
        //Left Max
        int leftMax[] = new int[height.length];
        
        leftMax[0] = height[0];
        
        for(int i = 1; i < height.length; i++){
            if(leftMax[i-1]<height[i]){
                leftMax[i]=height[i];
            }
            else{
                leftMax[i] = leftMax[i-1];
            }
        }
        
        // for(int i = 0; i < height.length; i++){
        //     System.out.println(leftMax[i]);     //to see leftMax
        // }
//////////////////////////////////////////////////////////////////////////////////////
        //Right Max
        int rightMax[] = new int[height.length];
        
        rightMax[height.length-1] = height[height.length-1]; //LastIndex

        for(int j = height.length-2; j >= 0; j--){
           if(height[j] >rightMax[j+1]){
                rightMax[j] = height[j];
           }
           else{
                rightMax[j]=rightMax[j+1];
           }
        }
        
        // for(int j = 0; j < rightMax.length; j++){
        //     System.out.println(rightMax[j]);      //to see rightMax
        // }
/////////////////////////////////////////////////////////////////////////////////////

        int trappedRainWater = 0;

        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedRainWater += waterLevel- height[i];  
        }

        return trappedRainWater;
    }

    
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};

        System.out.println(trappedWater(height));
    }    
}
