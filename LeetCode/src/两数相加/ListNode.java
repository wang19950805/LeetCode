package �������;

public class ListNode {

	//Ϊ����ʹ�ã�����ʹ��public
		public int data;   //������ݵı���
		public ListNode next;   //��Ž��ı�����Ĭ��Ϊnull
        public ListNode(int newdata) {
		
		}

		public ListNode(){}    //�޲ι��췽��
		
		//��ӽ��
		public void add(int newdata){
			ListNode newNode = new ListNode(newdata);    //����һ�����
			if(this.next == null){
				this.next  = newNode;
			}
			else{
				this.next.add(newdata);
			}
		}


	//�������ֵ
		public void print(){
			System.out.println(this.data+"-->");
			if(this.next != null){
				this.next.print();
			}
		}
		
	}
