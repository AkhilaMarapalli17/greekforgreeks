'''
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

import heapq


class Solution:
    def inorder(self,root,target, k ,heap):
        if not root:
            return 
        
        self.inorder(root.left,target, k,heap)
        
        heapq.heappush(heap,(-abs(root.data-target),-root.data))
        
        if len(heap)>k:
            heapq.heappop(heap)

        self.inorder(root.right,target, k,heap)
        
    def getKClosest(self, root, target, k):
        
        heap = []
        
        self.inorder(root,target, k,heap)
        
        res = []
        
        for diff,value in heap:
            res.append(-value)
            
        return res
        
    