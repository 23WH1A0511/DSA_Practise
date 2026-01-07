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

      //----------------------CHECK EXISTANCE-------------------------------------
      public class Sets {         
      // Remove duplicates
      public List<Integer> removeDuplicates(List<Integer> nums){
            List<Integer> ans = new ArrayList<>();
            Set<Integer> set = new HashSet<>();            
            for(int num : nums){
                  if(!set.contains(num)){
                        ans.add(num);
                  }
                  set.add(num);
            }
            return ans;
            }
            // Check Existence
            public boolean checkExistance(List<Integer> nums, int num){
                  Set<Integer> set = new HashSet<>(nums);
                    if(!set.contains(num)) return false;
                    return true;
            }
            // Longest Consecutive Sequence length
            public int longestConsecSeq(List<Integer> nums){
                  Set<Integer> set = new HashSet<>(nums);
                  int maxLen = 0;            
                  for(int num : set){
                        if(!set.contains(num - 1)){
                            int curr = num;
                            int count = 0;
                            while(set.contains(curr + 1)){
                                curr++;
                                count++;
                            }
                            maxLen = Math.max(maxLen,count);
                        }
                    }
                    return maxLen;
                }
                // Union of arrays
                public List<Integer> unionOfArrays(List<Integer> nums1, List<Integer> nums2){
                    Set<Integer> set = new HashSet<>(nums1);
                    for(int num : nums2) set.add(num);
            
                    return new ArrayList<>(set);
                }
                // Intersection of arrays
                public List<Integer> intersectOfArrays(List<Integer> nums1, List<Integer> nums2){
                    Set<Integer> set = new HashSet<>(nums1);
                    List<Integer> res = new ArrayList<>();
                    for(int num : nums2){
                       if(set.contains(num) && !res.contains(num)) res.add(num);
                    }
                    return res;
                }
                // Distinct count
                public int countDistinct(List<Integer> nums){
                    Set<Integer> set = new HashSet<>(nums);
                    return set.size();
                }    
            }
            
