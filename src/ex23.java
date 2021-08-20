import java.util.*;

//hw23 - finish
public class ex23 {
    public static void main(String[] args) {
        HashMap<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Apple", 1);
        productPrices.put("Milk",2);
        productPrices.put("Cheese", 6);
        productPrices.put("Computer", 900);
        productPrices.put("Couch", 500);
        productPrices.put("Chocolate", 1);
        productPrices.put("Mobile Phone", 400);
        productPrices.put("Sourcream", 1);

        int counterPricesBelow1 = 0;
        for (Integer price : productPrices.values()){
            if (price <= 1){
                counterPricesBelow1++;
            }
        }
        System.out.println(counterPricesBelow1 + " products below are below or equal 1 euro");

        //the highest
        int maximalPrice = 0;
        //String maxName ;
        for (Integer price : productPrices.values()){
            if (price >= maximalPrice ){
                maximalPrice = price;
            }
        }
        //System.out.println(maximalPrice + " the maximum price ");
        int priceMin = maximalPrice;
        for (Integer price : productPrices.values()){
            if (price <= priceMin ){
                priceMin = price;
            }
        }
        System.out.println();
        System.out.println(priceMin + " is a minimal price ");
        System.out.println();


        for (String key : productPrices.keySet()){
            if(productPrices.get(key) == maximalPrice){
                System.out.println(key + " is a product with the highest price " + maximalPrice);
            }
        }
        System.out.println();
        for (String key : productPrices.keySet()){
            if(productPrices.get(key) == priceMin){
                System.out.println(key + " is a product name with the minimum  price " + priceMin);
            }
        }

        HashMap<String, Integer> productPrices2 = new HashMap<>();
        productPrices2.put("Bread", 2);
        productPrices2.put("Juice",1);
        productPrices2.put("Eggs", 3);
        productPrices2.put("Shampoo", 10);
        productPrices2.put("Rice", 2);

        //merge productPrices and productPrices2 and printout the number in the merged hashmap
        HashMap<String, Integer> productPricesMerged= new HashMap<>();
        productPricesMerged.putAll(productPrices);
        productPricesMerged.putAll(productPrices2);
        System.out.println();
        System.out.println("There are " + productPricesMerged.size() + " elements in the new merged hashmap.");
        System.out.println(productPricesMerged);
        //*Sort all values in ascending order.
        ArrayList<Integer> myArray = new ArrayList<>(); // array of values
        ArrayList<Integer> myArraySorted = new ArrayList<>(); //the same array, that will be changed to a sorted one

        for (String key : productPricesMerged.keySet()){//putting values to arrays from HashMap
            myArray.add(productPricesMerged.get(key));
            myArraySorted.add(productPricesMerged.get(key));
        }
        System.out.println();
        System.out.println(myArray + " - all the values from HashMap merged");
        Collections.sort(myArraySorted);
        System.out.println(myArraySorted + " - sorted array");

    }
}
