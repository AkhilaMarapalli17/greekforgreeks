'''
class Node:
    def __init__(self, x):
        self.data = x
        self.next = None
'''
class Solution:
    def swapKth(self, head, k):
        # code here
        t = Node(0)
        t.next = head
        left, right = None, None
        ln, rn = 0, 0
        def walk(n):
            nonlocal ln, rn, left, right
            if n is None:
                rn += 1
                return
            if ln == k:
                left = n
            ln += 1
            walk(n.next)
            if rn == k:
                right = n
            rn += 1
        
        walk(t)
        #print(f"{left.data = }, {right.data = }")
        if not left or not right:
            return t.next
        left.data, right.data = right.data, left.data
        return t.next
