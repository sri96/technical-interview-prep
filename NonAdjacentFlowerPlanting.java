/*
Given:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
*/

public class NonAdjacentFlowerPlanting{
    public static void main(String[] args) throws Exception {
        int[] flowerBed = {1, 0, 0, 0, 1};
        System.out.println(new NonAdjacentFlowerPlanting().canPlaceFlowers(flowerBed, 5));
    }
    public boolean canPlaceFlowers(int[] flowerbed, int numberOfFlowers) {

        int outerIndexVariable = 0, numberOfFlowersPlantable = 0;
        if(flowerbed != null){
            if(numberOfFlowers != 0){
        while (outerIndexVariable < flowerbed.length) {
            if (flowerbed[outerIndexVariable] == 0 && (outerIndexVariable == 0 || flowerbed[outerIndexVariable - 1] == 0) && (outerIndexVariable == flowerbed.length - 1 || flowerbed[outerIndexVariable + 1] == 0)) {
                flowerbed[outerIndexVariable++] = 1;
                numberOfFlowersPlantable++;
            }
             if(numberOfFlowersPlantable >= numberOfFlowers)
                return true;
            outerIndexVariable++;
        }
    }
}
        return false;

}
}