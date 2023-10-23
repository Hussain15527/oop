package access;

import java.util.Arrays;

public class A {
    public int a;
    private String str;
    private int[] nums;

    public A(int a, String str) {
        this.a = a;
        this.str = str;
        this.nums = new int[a];
    }
    
    String getArr() {
        return Arrays.toString(Arrays.copyOfRange(nums, 0, nums.length));
    }

    void setArr(int index,int number) {
        nums[index] = number;
    }
}
