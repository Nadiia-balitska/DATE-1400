public class Main {
    public static void main(String[] args) {
        Assignment a = new Assignment();

        System.out.println(a.addThreeNumbers(1,2,3));                 
        System.out.println(a.isNumberSmallMediumOrBig(15));           
        a.printCourseName("DATA1200");                             

        System.out.println(a.isColorInNorwegianFlag("blue"));        
        System.out.println(a.combinedLength("hei","verden"));         
        System.out.println(a.checkIfStringIsWithinCorrectLength("hello", 10, 2)); 

        System.out.println(a.arraySum(new int[]{1,2,3}));             
        a.printAllStrings(new String[]{"A","B","Corona","C"});
        a.printAllStringsNotCorona(new String[]{"A","Corona","B"});
        a.printAllStringsNotCoronaCaseInsensitive(new String[]{"CoRoNa","B","c"});

        System.out.println(a.findAllIntsBelowNumberInArray(new int[]{5,1,10,-2}, 5)); 

       

    }
}
