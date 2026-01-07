// --------------------- PERFORM MAP OPERATIONS------------------------
      class Main {
          public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int T = sc.nextInt();
              for (int t = 0; t < T; t++) {
                  int N = sc.nextInt();
                  Map<Integer, Integer> map = new HashMap<>();
                  while (N-- != 0) {
                      int C = sc.nextInt();
                      if (C == 0) {
                          int k = sc.nextInt();
                          int v = sc.nextInt();
                          map.put(k, v);
                      } 
                      else if (C == 1) {
                          int k = sc.nextInt();
                          System.out.print(map.containsKey(k) + " ");
                      } 
                      else if (C == 2) {
                          int k = sc.nextInt();
                          System.out.print(map.get(k) + " ");
                      } 
                      else if (C == 3) {
                          System.out.print(map.size() + " ");
                      } 
                      else {
                          int k = sc.nextInt();
                          map.remove(k);
                      }
                  }
                  System.out.println();
              }
              sc.close();
          }
      }


      //-------------------- TWO SUM----------------------------
      public int[] solve(int[] a, int n, int k) {
        // Complete the given function and do not write main method
        Map<Integer, Integer> map = new HashMap<>();
          for (int i = 0; i < a.length; i++) {
            int complement = k - a[i];
            if (map.containsKey(complement)) {
              return new int[] { map.get(complement), i };
            }
            map.put(a[i], i);
          }
          return new int[0];
      }
      
      //-------------------- SAME DIFFERENCE ------------------------
      public long solve(int a[]) {
        long ans = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
          int key = a[i] - i;
          ans += m.getOrDefault(key, 0);
          m.put(key, m.getOrDefault(key, 0) + 1);
        }
        return ans;
      }

    //----------------------REPEATED AND MISSING ELEMENT------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            Set<Integer> S = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                if (S.contains(A)) {
                    System.out.print(A + " ");
                } else {
                    S.add(A);
                }
            }
            for (int i = 1; i <= N; i++) {
                if (!S.contains(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }

    //--------------------------COUNT REMOVALS------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            sc.nextLine();
            String S1 = sc.next();
            String S2 = sc.next();
            Map<Character, Integer> n = new HashMap<>();
            Map<Character, Integer> n1 = new HashMap<>();
            // Frequency map for S1
            for (char ch : S1.toCharArray()) {
                n.put(ch, n.getOrDefault(ch, 0) + 1);
            }
            // Frequency map for S2
            for (char ch : S2.toCharArray()) {
                n1.put(ch, n1.getOrDefault(ch, 0) + 1);
            }
            int min1 = Integer.MAX_VALUE;
            for (char ch : n1.keySet()) {
                if (!n.containsKey(ch)) {
                    min1 = 0;
                    break;
                }
                int a = n.get(ch);
                int b = n1.get(ch);
                min1 = Math.min(min1, a / b);
            }
            System.out.println(min1);
        }
        sc.close();
    }

    //---------------------------MOST FREQUENT CHARACTER-------------------------------
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      sc.nextLine(); // Consume the leftover newline character         
      for (int t = 0; t < T; t++) {
        String S = sc.nextLine();
        System.out.println(getMFC(S));
      }
    }
    public static char getMFC(String S) {
      Map<Character, Integer> freqMap = new HashMap<>();
      char maxChar = S.charAt(0);
      int maxFreq = 0;    
      for (char c : S.toCharArray()) {
        freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        if (freqMap.get(c) > maxFreq) {
          maxFreq = freqMap.get(c);
          maxChar = c;
        }
      }
      return maxChar;
    }

    //------------------------FREQUENCY OF CHARACTERS-----------------
    import java.util.HashMap;
    public class Main {
        public static void main(String[] args) {
            String input = "apple";
            printCharacterFrequency(input);
        }
        public static void printCharacterFrequency(String input) {
            // Create a HashMap to count the frequency
            // A HashMap stores Key-Value pairs (Character -> Count)
            Map<Character, Integer> frequencyMap = new HashMap<>();
            // Populate the map with character frequencies
            for (char ch : input.toCharArray()) {
                // getOrDefault checks if the char exists; if not, it starts at 0 and adds 1
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
            // Print the frequency of each character once
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    //-------------------------COUNT FREQUENCIES-----------------------------------
    public class Maps {
        // Count Frequencies
        public void countFrequices(String word){
            HashMap<Character,Integer> freq = new HashMap<>();
            for(char ch : word.toCharArray()){
                freq.put(ch,freq.getOrDefault(ch,0) + 1);
            }
            for(char ch : freq.keySet()){
                System.out.println(ch + " : " + freq.get(ch));
            }
        }
        // First non-repeating element
        public void firstNonRepeating(String word){
            LinkedHashMap<Character,Integer> freq = new LinkedHashMap<>();
            for(char ch : word.toCharArray()){
                freq.put(ch,freq.getOrDefault(ch,0) + 1);
            }
            int flag = 0;
            for(char ch : freq.keySet()){
                if(freq.get(ch) == 1){
                    System.out.println(ch);
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) System.out.println("No such element");
        }
        // Majority element
        public int majorityElement(List<Integer> nums){
            HashMap<Integer,Integer> freq = new HashMap<>();
            for(int num : nums){
                freq.put(num,freq.getOrDefault(num,0) + 1);
            }
            int len = nums.size();
            for(int num : freq.keySet()){
                if(freq.get(num) > len/2){
                    return num;
                }
            }
            return -1;
        }
        // count distinct elements
        public int countDistinctElements(List<Integer> nums){
            HashMap<Integer,Integer> freq = new HashMap<>();
            for(int num : nums){
                freq.put(num,freq.getOrDefault(num,0) + 1);
            }
            return freq.size();
        }
    }
