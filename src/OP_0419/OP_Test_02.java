package OP_0419;
import java.util.Scanner;
public class OP_Test_02 {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      String [] id = new String[5];
      String [] pwd = new String[5];
      String inputId = null, InputPwd = null;
      int num, index=0, count=0;
      boolean login = true, tf;
      //��ü ����
      while(true) {
         //�⺻ ���
         System.out.println("==================");//ĭ������
         System.out.println("1.�α���");
         System.out.println("2.ȸ������");
         System.out.println("3.Ư��ȸ�� ����");
         System.out.println("4.Ư��ȸ�� ��й�ȣ ����");
         System.out.println("5.Ư��ȸ�� ����");
         System.out.println("6.��� ȸ�� ����");
         System.out.println("7.������");
         System.out.print(">>> ");
         num = scan.nextInt();
         //����
         switch(num) {
         case 1://�α���
            System.out.println("==================");//ĭ������
            if(index ==0) {//��ϵ��ִ� ȸ���� �������
               System.out.println("ȸ������ ���ּ���");
            }else {
               //���̵� ��� �Է�
               System.out.println("���̵� �Է����ּ���");
               System.out.print(">>> ");
               inputId = scan.next();//���̵� �Է�
               System.out.println("��й�ȣ�� �Է����ּ���");
               System.out.print(">>> ");
               InputPwd = scan.next();//��� �Է�
               
               for(int i=0;i<count;i++) {
                  if(inputId.equals(id[i])) {
                     if(InputPwd.equals(pwd[i])) {//pwd�� �������
                        System.out.println("�α��� ����");
                        System.out.println(id[i]+"�� �������");//�Ϸ�� ����������
                     }else {
                        System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");//�Ϸ�� ����������
                     }//pwd�� Ʋ�����
                     login = false;
                     break;
                  }//id�� �������
                  login = true;
               }//for
               if(login) {
                  System.out.println("���� ���̵� �Դϴ�");//�Ϸ�� ����������
               }//id�� �������
            }//if else
            break;
         case 2://ȸ������
            System.out.println("==================");//ĭ������
            if(index>=5) {
               System.out.println("������ ������ �����ϴ�");//�Ϸ�� ����������
            }//�������
            else {
               tf = true;//ȸ������ �ݺ��� �ʱⰪ
               System.out.println("ȸ�������� �����մϴ�");
               while(tf) {
                  System.out.println("���̵� �Է����ּ���");
                  System.out.print(">>> ");
                  inputId = scan.next();//ȸ������ ���̵� �Է�
                  for(int i=0;i<=count;i++) {//�ߺ�Ȯ��
                     if(inputId.equals(id[i])) {//�ߺ��ϰ��
                        System.out.println("������ ���̵� �ֽ��ϴ�");
                        tf = true;
                        break;
                     }//if
                     else {
                        tf = false;//while
                     }
                  }//for
               }//while
               System.out.println("��й�ȣ�� �Է����ּ���");
               System.out.print(">>> ");
               InputPwd = scan.next();//ȸ������ ��� �Է�

               id[count] = inputId;//id�߰�
               pwd[count] = InputPwd;//pwd�߰�
               count++;//�迭 ����
               
               System.out.println("������ �����մϴ�");//�Ϸ�� ����������
               index = count;//�迭�� ����� ũ��
            }//���强��
            break;
         case 3://Ư��ȸ�� ����
            System.out.println("==================");//ĭ������
            if(index ==0) {//��ϵ��ִ� ȸ���� �������
               System.out.println("��ϵǾ��ִ� ȸ���� �����ϴ�");
            }else {
               System.out.println("���̵� �Է����ּ���");
               System.out.print(">>> ");
               inputId = scan.next();//���̵� �Է�
               for(int i=0;i<count;i++) {
                  if(inputId.equals(id[i])) {
                     System.out.println("id : "+id[i]);
                     System.out.println("pwd : "+pwd[i]);//�Ϸ�� ����������
                     login = false;
                     break;
                  }//id�� �������
                  login = true;
               }//for
               if(login) {
                  System.out.println("���� ���̵� �Դϴ�");//�Ϸ�� ����������
               }//id�� �������
            }
            break;
         case 4://Ư��ȸ�� ��й�ȣ ����
            System.out.println("==================");//ĭ������
            if(index ==0) {//��ϵ��ִ� ȸ���� �������
               System.out.println("��ϵǾ��ִ� ȸ���� �����ϴ�");
            }else {
               System.out.println("���̵� �Է����ּ���");
               System.out.print(">>> ");
               inputId = scan.next();//���̵� �Է�
               for(int i=0;i<count;i++) {
                  if(inputId.equals(id[i])) {
                     System.out.println("��й�ȣ�� �Է����ּ���");
                     System.out.print(">>> ");
                     InputPwd = scan.next();//������ ��� �Է�
                     pwd[i] = InputPwd;
                     System.out.println("��й�ȣ�� �����Ǿ����ϴ�");
                     login = false;
                     break;
                  }//id�� �������
                  login = true;
               }//for
               if(login) {
                  System.out.println("���� ���̵� �Դϴ�");//�Ϸ�� ����������
               }//id�� �������
            }
            break;
         case 5://Ư��ȸ�� ����
            System.out.println("==================");//ĭ������
            if(index ==0) {//��ϵ��ִ� ȸ���� �������
               System.out.println("��ϵǾ��ִ� ȸ���� �����ϴ�");
            }else {
               System.out.println("���̵� �Է����ּ���");
               System.out.print(">>> ");
               inputId = scan.next();//���̵� �Է�
               for(int i=0;i<count;i++) {
                  if(inputId.equals(id[i])) {
                     System.out.println("��й�ȣ�� �Է����ּ���");
                     System.out.print(">>> ");
                     InputPwd = scan.next();//��й�ȣ �Է�
                     if(InputPwd.equals(pwd[i])) {
                        id[i] = null;
                        pwd[i] = null;
                        System.out.println("ȸ���� �����Ǿ����ϴ�");
                     }else {
                        System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ� ó������ �ٽ� �Է����ּ���");
                     }
                     index--;
                     login = false;
                     break;
                  }//id�� �������
                  login = true;
               }//for
               if(login) {
                  System.out.println("���� ���̵� �Դϴ�");//�Ϸ�� ����������
               }//id�� �������
            }
            System.out.println(index+"="+count);
            break;
         case 6://��� ȸ�� ����
            System.out.println("==================");//ĭ������
            if(index ==0) {//��ϵ��ִ� ȸ���� �������
               System.out.println("��ϵǾ��ִ� ȸ���� �����ϴ�");
            }else {
               System.out.println("��� ȸ���� ���̵�� ����Դϴ�");
               for(int i=0;i<count;i++) {
                  if(id[i] != null){
                     System.out.println("id : "+id[i]+" pwd : "+pwd[i]);
                  }                  
               }//for
            }
            break;
         case 7://������
            System.out.println("�����մϴ�");
            System.exit(1);//���α׷� ��������
            break;
         default:
            break;
         }//switch
      }//while
   }//main
}//class