Set<Integer> result = new HashSet<>();
for(int num1 : nums1) {
    for(int num2 : nums2) {
        if(num1 == num2) {
            result.add(num1);
            break;
        }
    }
}