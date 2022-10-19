
/*

Sample Input

2 3
2 4
16 32 96

*/



// Input Format 

// The first line contains two space-separated integers,  n and m, the number of elements in arrays a and b.
// The second line contains n distinct space-separated integers a[i] where 0<=i<n.
// The third line contains m distinct space-separated integers b[j] where 0<=j<m.


// Code:  

BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());


