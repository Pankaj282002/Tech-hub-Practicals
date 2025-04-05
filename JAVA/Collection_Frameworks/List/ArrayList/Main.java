import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int choice;
        System.out.println("Parctical Questions 1");
        do{
            System.out.println("1. Add value in ArrayList.");
            System.out.println("2. Display All vaues in ArrayList.");
            System.out.println("3. Search Value in ArrayList.");
            System.out.println("4. Sort all values in Ascending Order in ArrayList.");
            System.out.println("5. Sort All vaues in Descending order ArrayList.");
            System.out.println("6. Find Max value in ArrayList.");
            System.out.println("7. Find Min value in ArrayList.");
            System.out.println("8. Update value in ArrayList.");
            System.out.println("9. Deleter value in Arraylist.");
            System.out.println("0. Exit.");
            
            System.out.print("Enter your choice : ");
            choice = in.nextInt();
            switch(choice){
                case 0:
                    return;
                case 1:
                    
                    if(al.isEmpty()){
                        System.out.println("ArrayList is empty please Enter minimum 10 Values in");
                        for(int i=0; i<5; i++){
                            System.out.printf("Enter a %d elment in array : ", i);
                            int value = in.nextInt();
                            al.add(value);
                        }
                    }else{
                        System.out.println("Add a Value in ArrayList.");
                        System.out.println("Enter new value in ArrayList :  ");
                        int value = in.nextInt();
                        al.add(value);
                    }
                    System.out.println();
                        break;
                case 2:
                    System.out.println("Display all Values in aray  : " + al);
                    System.out.println();
                        break;
                case 3:
                    System.out.println("Enter Value of search : ");
                    int value = in.nextInt();
                    if(al.contains(value)){
                        System.out.printf("%d is found at %d index", value, al.indexOf(value));
                    }else{
                        System.out.printf("%d is not found in ArrayList");
                    }
                    System.out.println();
                    break;
                case 4:
                     Collections.sort(al);
                    System.out.println("Sorted in Ascending Order: " + al);
                    break;
                case 5 :
                    break;
                default :
                    System.out.println("Enter a valid choice......! ");
                    break;
            }
        }while(true);
    }
}