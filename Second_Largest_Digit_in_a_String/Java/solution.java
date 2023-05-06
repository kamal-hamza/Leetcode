class solution {

    public int secondHighest(String s) {

        int secondLargest = -1;
        int largest = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String cStr = String.valueOf(c);
            try {
                int num = Integer.parseInt(cStr);
                if (num > secondLargest) {
                    if (num > largest) {
                        secondLargest = largest;
                        largest = num;
                    }
                    else if (num == largest) {
                        continue;
                    }
                    else {
                        secondLargest = num;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }

        return secondLargest;

    }
    
}