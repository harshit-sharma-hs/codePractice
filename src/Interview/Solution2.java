//package Interview;
//
//import java.util.List;
//
//public class Solution2 {
//
//    static Node mergeLists(List<List<Node>> list)
//    {
//
//        return null;
//    }
//
//    static  Node divide(Node l1,Node l2)
//    {
//       // if(l1==null || l2 == null)
//
//    }
//    //lists = [[1,4,5],[1,3,4],[2,6]]
//    static Node merge(Node l1,Node l2)
//    {
//        Node curr = new Node(0);
//        Node dummy = curr;
//        while(l1!=null||l2!=null)
//        {
//            if(l1.data<l2.data)                            //1,1  1,2
//            {
//                curr.next=l1;
//                l1=l1.next;
//            }
//            else
//            {
//                curr.next=l2;
//                l2=l2.next;
//            }
//            curr=curr.next;
//        }
//        if(l1!=null)
//            curr.next=l1;
//        else
//            curr.next=l2;
//
//        return dummy.next;
//    }
//
//
//    static Node findMid(Node l)
//    {
//        Node fast = l;
//        Node slow = l;
//        Node prev = null;
//        while(fast.next!=null || fast.next.next!=null)
//        {
//            fast=fast.next.next;
//            prev=slow;
//            slow=slow.next;
//        }
//        slow.next=null;
//        return slow;
//    }
//
//
//    public static void main(String[] args) {
//
//    }
//}
//
//
//
//
////Input: lists = [[1,4,5],[1,3,4],[2,6]]
////Output: [1,1,2,3,4,4,5,6]
