class Solution:
    def countValid(self, n, arr):
        # code here
        arr = set(arr)
        sz = len(arr)
        if n==1:
            return sz-1 if 0 in arr else sz
        # <i> total ways without restriction = 9*10*10...upto n-1
        # <ii> total ways where none of arr digits are present = pow(10-sz,n)
        # total ways where atleast one of arr digits are present = <i> - <ii>
        total_with_zero_in_arr = 9*10**(n-1) - (10-sz)**n
        if 0 not in arr:
            total_with_zero_in_arr += (10-sz)**(n-1) # fill first place with 0
        return total_with_zero_in_arr