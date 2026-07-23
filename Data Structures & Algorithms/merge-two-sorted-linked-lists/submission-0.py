# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        pointer1 = list1
        pointer2 = list2
        current_node = None
        head = None

        if pointer1 and pointer2:
            if pointer1.val <= pointer2.val:
                head = pointer1
                current_node = pointer1
                pointer1 = pointer1.next
            else:
                head = pointer2
                current_node = pointer2
                pointer2 = pointer2.next
        elif pointer1:
            return pointer1
        else:
            return pointer2

        while pointer1 or pointer2:
            if pointer1 and pointer2:
                if pointer1.val <= pointer2.val:
                    current_node.next = pointer1
                    current_node = pointer1
                    pointer1 = pointer1.next
                else:
                    current_node.next = pointer2
                    current_node = pointer2
                    pointer2 = pointer2.next
            elif pointer1:
                current_node.next = pointer1
                return head
            else:
                current_node.next = pointer2
                return head

        return head

        