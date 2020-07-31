class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return target==nums[0]? 0:-1;
        int rot = findRot(nums);
        System.out.println(""+rot);
        if(rot == 0)
        {
            return search1(nums,0,nums.length -1, target);
        }
        if(target < nums[0])
        {
            return search1(nums,rot,nums.length-1,target);
        }
        else
        {
            return search1(nums,0,rot-1,target);

        }
    }

    public int findRot(int[] nums)
    {
        int left = 0;
        int right = nums.length - 1;
        if(nums[left] <= nums[right]) return 0;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(nums[mid] > nums[mid + 1])
            {
                return mid + 1;
            }
            else
            {
                if(nums[mid] < nums[left])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
        }

        return 0;
    }

    public int search1(int[] nums,int left, int right, int target)
    {
       while (left <= right) {
      int pivot = (left + right) / 2;
      if (nums[pivot] == target)
        return pivot;
      else {
        if (target < nums[pivot])
          right = pivot - 1;
        else
          left = pivot + 1;
      }
    }
    return -1;
    }
}
