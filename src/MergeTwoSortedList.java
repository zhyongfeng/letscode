import com.sun.org.apache.regexp.internal.REUtil;
import sun.jvm.hotspot.runtime.ResultTypeFinder;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 4:17 PM 2019/11/7
 * @Modified By:
 */
public class MergeTwoSortedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node3;
        node3.next = node5;

        node2.next = node4;
        node4.next = node6;

        ListNode result = mergeTwoLists(node1, node2);
        while (result.next != null){
            System.out.println(result.value);
            result = result.next;
        }
        System.out.println(result.value);


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 类似归并排序中的合并过程
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return dummyHead.next;

    }
}
