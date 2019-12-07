package homework1;

public class IndexOfATargetElement {
    public static void main(String[] args) {
        Integer[] myArray={1,45,28,13,32,19,4};
        Integer position=findArrayIndexOfTargetElement(myArray,1);
    }

    public static Integer findArrayIndexOfTargetElement(Integer[] myArray, Integer value){
        Integer position=-1;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==value){
                position=i;
                System.out.println("The value you choose has position " + position +" in array. " );
                break;
            }
        }
        if(position<0){
            System.out.println("The value you entered is not present in your array");
        }
        return position;
    }
}
