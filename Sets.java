      //-----------------------HAPPY NUMBER---------------------------
      import java. util.*;
      class Main {
          public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int t = sc.nextInt();
              while(t-- > 0){
                  int n = sc.nextInt();
                  Set<Integer> s = new HashSet<>();
                  while(n != 1 && !s.contains(n)){
                      s.add(n);
                      n = getNextNumber(n);
                  }
                  if(n == 1){
                      System.out.println("Yes");
                  }
                  else{
                      System.out.println("No");
                  }
              }
          }
         // this is getting the sum  of the squares of digits of the number 
          public static int getNextNumber(int n){
              int sum = 0;
              while(n > 0){
                  int digit = n %10;
                  sum += digit*digit;
                  n = n/10;
              }
              return sum;
          }
      }

      //------------------------INTERSECTION OF ARRAYS-----------------------------
      public List<Integer> intersectionOfTwoArrays(List<Integer> a, List<Integer> b) {
          // Use a LinkedHashSet to maintain order while ensuring uniqueness
          Set<Integer> setA = new HashSet<>(a);
          Set<Integer> result = new TreeSet<>(); // TreeSet keeps results sorted
          for (Integer num : b) {
              // If the element from list 'b' exists in set 'a', it's an intersection
              if (setA.contains(num)) {
                  result.add(num);
              }
          }
          // Convert the Set back to a List for the return type
          return new ArrayList<>(result);
      }

      //------------------------UNION OF ARRAYS--------------------------------------
      public List<Integer> unionOfTwoArrays(List<Integer> a, List<Integer> b) {
        // TreeSet automatically removes duplicates and keeps elements sorted
        Set<Integer> unionSet = new TreeSet<>();
        // Adding all elements from both lists
        unionSet.addAll(a);
        unionSet.addAll(b);
        // Convert the set back to the required List format
        return new ArrayList<>(unionSet);
      }

      //----------------------CHECK DUPLICATES-------------------------------------

